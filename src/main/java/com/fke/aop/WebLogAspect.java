package com.fke.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

@Aspect
@Component
public class WebLogAspect {
    private static final Logger logger = LoggerFactory.getLogger(WebLogAspect.class);
    @Pointcut("execution(public * com.fke.controller.*.*(..))")
    public void weblog(){}

    @Before("weblog()")
    public void beforeLog(JoinPoint joinPoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();
        logger.info("url:"+request.getRequestURL().toString());
        logger.info("http_method:"+request.getMethod());
        logger.info("ip:"+request.getRemoteAddr());
        Enumeration<String> params = request.getParameterNames();
        while (params.hasMoreElements()){
            String pareName = params.nextElement();
            logger.info("name:{},value:{}",pareName,request.getParameter(pareName));
        }
    }
    @AfterReturning(returning = "obj" ,pointcut = "weblog()")
    public void afterLog(Object obj){
        logger.info("response:"+obj);
    }
}
