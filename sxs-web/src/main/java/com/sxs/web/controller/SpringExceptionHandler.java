package com.sxs.web.controller;

import com.sxs.common.bean.SessionUser;
import com.sxs.common.enums.ResultCodeEnum;
import com.sxs.common.exception.ValidatorException;
import com.sxs.common.response.ReturnT;
import com.sxs.common.utils.DkyUtils;
import com.sxs.web.exception.NoLoginException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 统一异常处理
 * Created by wangpeng on 2017/1/6.
 */
@ControllerAdvice
public class SpringExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringExceptionHandler.class);

    /**
     * 统一校验异常处理
     * @param e
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @ExceptionHandler(ValidatorException.class)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody ReturnT handleException(ValidatorException e, HttpServletRequest request, HttpServletResponse response)throws IOException{
        printLog(e,request,response);
        return new ReturnT().failureData(ResultCodeEnum.VALIDATOR_ERROR.getCode(),e.getMessage());
    }


    /**
     * 统一校验异常处理
     * @param e
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @ExceptionHandler(NoLoginException.class)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody ReturnT handleException(NoLoginException e, HttpServletRequest request, HttpServletResponse response)throws IOException{
        printLog(e,request,response);
        return new ReturnT().failureData(ResultCodeEnum.NOLOGIN);
    }


    /**
     * 统一异常处理
     * @param e
     * @param request
     * @param response
     * @return
     * @throws IOException
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody ReturnT handleException(Exception e, HttpServletRequest request, HttpServletResponse response)throws IOException{
        printLog(e,request,response);
        return new ReturnT().failureData(ResultCodeEnum.SYSTEM_ERROR);
    }

    private void printLog(Exception e, HttpServletRequest request, HttpServletResponse response){
        SessionUser sessionUser = DkyUtils.getCurrentUser();//获取当前登陆
        if(sessionUser != null){
            LOGGER.error("『授权』用户[{}]访问路径[{}],异常信息【{}】",sessionUser.getUserId(),request.getRequestURL(),e.getMessage());
        }else {
            LOGGER.error("访问路径[{}],错误[{}]",request.getRequestURL(),e.getMessage());
        }
    }
}
