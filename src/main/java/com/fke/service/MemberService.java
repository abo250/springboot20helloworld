package com.fke.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class MemberService {
    public String getMember(){
        log.info("2");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String name = "James";
        log.info("3");
        return name;
    }
}
