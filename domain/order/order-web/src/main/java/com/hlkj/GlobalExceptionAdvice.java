package com.hlkj;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionAdvice {

    @ExceptionHandler(value = Exception.class)
    public void handHttpException(HttpServletRequest request, Exception e){
        StringBuffer url = request.getRequestURL();
        System.out.println(url);
        System.out.println(e.getMessage());
    }

    @ExceptionHandler(value = ArithmeticException.class)
    @ResponseBody
    public void handArithmeticException(HttpServletRequest request, Exception e){
        StringBuffer url = request.getRequestURL();
        System.out.println(url);
        System.out.println(e.getMessage());
    }
}