package com.qiu.user.controller;

import entity.Result;
import entity.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author Rock Lee
 * @Date 2018/12/25 0025 16:52
 */
@RestControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public Result exception(Exception e){
        return  new Result(false,StatusCode.ERROR,e.getMessage());
    }
}
