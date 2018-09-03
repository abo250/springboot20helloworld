package com.fke.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class User {
    private int myid;
    private String myname;
    private int myage;

    @Override
    public String toString() {
        return "{\"id\":"+myid+"\"name\":"+myname+",\"age\":"+myage+"}";
    }

    public static void main(String[] args) {
        User user = new User();
        user.setMyage(20);
        user.setMyname("yusj");
        log.info(user.toString());
    }
}
