package com.gaodev.java.multiThread.startthread;

import com.gaodev.java.multiThread.createthreads.ThreadStyle;

/**
 * 描述：     对比start和run两种启动线程的方式
 */
public class StartAndRunMethod {

    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName());

        };
        runnable.run(); // main

        new Thread(runnable).start(); // 子线程
    }
}
