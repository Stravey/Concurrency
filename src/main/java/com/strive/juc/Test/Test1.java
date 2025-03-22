package com.strive.juc.Test;

import lombok.extern.slf4j.Slf4j;

public class Test1 {
    public static void main(String[] args) {

        Thread t = new Thread(){
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        };
        t.start();

        System.out.println("running");
    }
}
