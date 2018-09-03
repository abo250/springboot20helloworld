package com.fke.controller;

import com.fke.service.AyncJobService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

@RestController
@Slf4j
public class AsyncCronller {
    @Autowired
    private AyncJobService ayncJobService;
    @RequestMapping("asyncJob")
    public String getMember() throws InterruptedException {
        log.info("1");
        long start = System.currentTimeMillis();
        Future<String> t1Result = ayncJobService.doTaskOne();
        Future<String> t2Result = ayncJobService.doTaskTwo();
        Future<String> t3Result = ayncJobService.doTaskThree();

        long totalTime = 0;
        while(true){
            if(t1Result.isDone()&&t2Result.isDone()&&t3Result.isDone()){
                break;
            }else{
                Thread.sleep(1000);
            }
        }
        long end = System.currentTimeMillis();
        log.info("4");
        log.info("所有任务完成花费了"+(end-start)+"毫秒");
        return "所有任务完成花费了"+(end-start)+"毫秒";
    }
}
