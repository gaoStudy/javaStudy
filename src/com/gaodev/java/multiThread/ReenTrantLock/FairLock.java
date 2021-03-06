package com.gaodev.java.multiThread.ReenTrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class FairLock {
    /**
     *     true 表示 ReentrantLock 的公平锁
     */
    private  ReentrantLock lock = new ReentrantLock(true);

    public void testFail(){
        try {
            lock.lock();
            System.out.println(Thread.currentThread().getName() +"获得了锁");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args){

        FairLock fairLock = new FairLock();

        Runnable runnable = () -> {
            System.out.println(Thread.currentThread().getName()+"启动");
            fairLock.testFail();
        };

        Thread[] threadArray = new Thread[10];

        for (int i=0; i<10; i++) {
            threadArray[i] = new Thread(runnable);
        }

        for (int i=0; i<10; i++) {
            threadArray[i].start();
        }
    }


}
