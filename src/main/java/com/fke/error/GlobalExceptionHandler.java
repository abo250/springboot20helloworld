package com.fke.error;

import com.fke.exception.MyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice(basePackages = "com.fke.controller")
public class GlobalExceptionHandler {

    // @ResponseBody 返回json格式
    // modeAndView 返回页面
    @ExceptionHandler(MyException.class)
    @ResponseBody
    public Map<String, Object> errorResult() {
        // 实际开发中，怎么 将错误记录在日志中。
        Map<String, Object> errorResultMap = new HashMap<String, Object>();
        errorResultMap.put("errorCode", "500");
        errorResultMap.put("errorMsg", "全局捕获异常系统错误!");
        return errorResultMap;
    }
}
