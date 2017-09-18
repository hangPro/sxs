package com.sxs.web.controller;

import com.sxs.common.constats.GlobConts;
import com.sxs.common.utils.DateUtils;
import com.google.common.collect.Maps;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
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

    private String getFilePrefix(String fileName){
        return fileName.substring(fileName.indexOf("."),fileName.length());
    }

}
