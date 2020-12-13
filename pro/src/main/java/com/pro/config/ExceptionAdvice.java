package com.pro.config;

import com.pro.entity.res.ResponseBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.HttpStatus.*;

/**
 * 全局异常处理
 */
@Slf4j
@RestController
@ControllerAdvice
public class ExceptionAdvice {
    /**
     * 400
     */
    @ResponseStatus(BAD_REQUEST)
    @ExceptionHandler(value = HttpMessageNotReadableException.class)
    public ResponseBean httpMessageNotReadableException(HttpMessageNotReadableException e) {
        log.error("400", e);
        return ResponseBean.buildHttp(BAD_REQUEST);
    }

    /**
     * 404
     */
    @ResponseStatus(NOT_FOUND)
    @ExceptionHandler(value = NoHandlerFoundException.class)
    public ResponseBean noHandlerFoundException(NoHandlerFoundException e) {
        log.error("404", e);
        return ResponseBean.buildHttp(NOT_FOUND);
    }

    /**
     * 405
     */
    @ResponseStatus(METHOD_NOT_ALLOWED)
    @ExceptionHandler(value = HttpRequestMethodNotSupportedException.class)
    public ResponseBean httpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        log.error("405", e);
        return ResponseBean.buildHttp(METHOD_NOT_ALLOWED);
    }

    /**
     * 415
     */
    @ResponseStatus(UNSUPPORTED_MEDIA_TYPE)
    @ExceptionHandler(value = HttpMediaTypeNotSupportedException.class)
    public ResponseBean httpMediaTypeNotSupportedException(HttpMediaTypeNotSupportedException e) {
        log.error("415", e);
        return ResponseBean.buildHttp(UNSUPPORTED_MEDIA_TYPE);
    }

    /**
     * 500
     */
    @ResponseStatus(INTERNAL_SERVER_ERROR)
    @ExceptionHandler(value = HttpServerErrorException.class)
    public ResponseBean httpServerErrorException(HttpServerErrorException e) {
        log.error("500", e);
        return ResponseBean.buildHttp(INTERNAL_SERVER_ERROR);
    }

    /**
     * Exception
     */
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseBean allException(HttpServletRequest req, RuntimeException e) {
        log.error("未知异常", e);
        return ResponseBean.buildBean(100,"未知异常，原因是："+e);
    }
}
