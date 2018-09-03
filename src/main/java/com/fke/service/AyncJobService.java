package com.fke.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.concurrent.Future;

@Service
@Slf4j
public class AyncJobService {

    Random random = new Random();

    @Async
    public Future<String> doTaskOne() throws InterruptedException {
        long start = System.currentTimeMillis();
        log.info("开始任务一");
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("任务一完成用了"+(end-start)+"毫秒");
        return new AsyncResult<>("任务一完成");
    }
    @Async
    public Future<String> doTaskTwo() throws InterruptedException {
        long start = System.currentTimeMillis();
        log.info("开始任务二");
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("任务二完成用了"+(end-start)+"毫秒");
        return new AsyncResult<>("任务二完成");
    }
    @Async
    public Future<String> doTaskThree() throws InterruptedException {
        long start = System.currentTimeMillis();
        log.info("开始任务三");
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        log.info("任务三完成用了"+(end-start)+"毫秒");
        return new AsyncResult<>("任务三完成");
    }
}
