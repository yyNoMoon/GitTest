package com.example.demo.utils;

/**
 * @projectName springboot-demo
 * @packageName com.example.demo.utils
 * @description: TODO
 * @author gaoyue
 * @date 2021/10/18 18:09
 */
public class CustomException extends Exception {
    public CustomException(){
        super();
    }

    public CustomException(String msg){
        super(msg);
    }

    public CustomException(String msg, Throwable cause){
        super(msg, cause);
    }

    public CustomException(Throwable cause){
        super(cause);
    }
}

