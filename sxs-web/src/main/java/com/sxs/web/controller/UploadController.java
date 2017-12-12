package com.sxs.web.controller;

import com.google.common.collect.Maps;
import com.sxs.common.constats.GlobConts;
import com.sxs.common.response.ReturnT;
import com.sxs.common.utils.DateUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by wangpeng on 2017/2/20.
 */
@RestController
@RequestMapping(value = "upload")
public class UploadController {

    public static final Logger LOGGER = LoggerFactory.getLogger(UploadController.class);


    @RequestMapping(value = "file")
    public Map uploadFile(@RequestParam(value = "Filedata",required = false) MultipartFile filedata,HttpServletRequest request){
        Map map  = Maps.newHashMap();
        String filePath = "";
        try {
            String path = request.getSession().getServletContext().getRealPath("/");
            byte[] bytes = IOUtils.toByteArray(filedata.getInputStream());
            String rootPath =  GlobConts.UPLOAD_IMAGE_FATH.concat(DateUtils.formatNowDate("yyyyMMdd")).concat("/");
            filePath = rootPath.concat(String.valueOf(System.currentTimeMillis())).concat(getFilePrefix(filedata.getOriginalFilename()));
            String uploadPath = path.concat(File.separator).concat(filePath);
            FileUtils.writeByteArrayToFile( new File(uploadPath),bytes);
        } catch (IOException e) {
            LOGGER.error("文件上传失败");
        }
        map.put("path",filePath);
        return map;
    }

    @RequestMapping(value = "uploadImg")
    public ReturnT uploadImg(@RequestParam(value = "fileStr",required = false) String fileStr, HttpServletRequest request){
        ReturnT returnT = new ReturnT();
        try {
            String path = request.getSession().getServletContext().getRealPath("/");
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] bytes = decoder.decodeBuffer(fileStr);
            if (bytes.length > Integer.MAX_VALUE){
                return returnT.failureData("图片过大，请重新上传！！！");
            }
            String rootPath =  GlobConts.UPLOAD_IMAGE_FATH.concat(DateUtils.formatNowDate("yyyyMMdd")).concat("/");
            String filePath = rootPath.concat(String.valueOf(System.currentTimeMillis()));
            String uploadPath = path.concat(File.separator).concat(filePath);
            returnT.setData(filePath);
            FileUtils.writeByteArrayToFile(new File(uploadPath),bytes);
        } catch (IOException e) {
            LOGGER.error("文件上传失败");
        }
        return returnT.successDefault();
    }

    @RequestMapping(value = "filedata")
    public ReturnT uploadFile(HttpServletRequest request){
        ReturnT returnT = new ReturnT();
        List<String> filePathList = new ArrayList<>(6);
        MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
        try {
            Iterator<String> fileNames = multiRequest.getFileNames();
            while (fileNames.hasNext()) { //循环遍历
                MultipartFile file = multiRequest.getFile(fileNames.next()); //取出单个文件
                String path = request.getSession().getServletContext().getRealPath("/");
                byte[] bytes = IOUtils.toByteArray(file.getInputStream());
                String rootPath =  GlobConts.UPLOAD_IMAGE_FATH.concat(DateUtils.formatNowDate("yyyyMMdd")).concat("/");
                String filePath = rootPath.concat(String.valueOf(System.currentTimeMillis())).concat(getFilePrefix(file.getOriginalFilename()));
                String uploadPath = path.concat(File.separator).concat(filePath);
                FileUtils.writeByteArrayToFile( new File(uploadPath),bytes);
                filePathList.add(filePath);
            }
        } catch (IOException e) {
            LOGGER.error("文件上传失败",e);
            return returnT.failureData("文件上传出错！");
        }
        returnT.setData(filePathList);
        return returnT.successDefault();
    }

    private String getFilePrefix(String fileName){
        return fileName.substring(fileName.indexOf("."),fileName.length());
    }

}
