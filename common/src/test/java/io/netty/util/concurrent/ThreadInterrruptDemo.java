package io.netty.util.concurrent;

import org.junit.Test;

import javax.annotation.Resource;

/**
 * @Author zl
 * @Date 2019-05-29
 * @Des ${todo}
 */
public class ThreadInterrruptDemo {


    @Test
    public  void threadTest(){

        boolean interrupted = false;
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i < 100; i++){
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                        System.out.println("thread:" + e );
                        System.out.println("线程是否处于中断状态" + Thread.currentThread().isInterrupted());
                    }
                }
            }
        });
        thread.start();
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            System.out.println("sleep:" + e );
        }
        if (thread.isAlive()){
            thread.interrupt();
            try {
                thread.join(5000);
                System.out.println(thread.isInterrupted());
            } catch (Exception ignored) {
                System.out.println("main :" + ignored );
                interrupted = true;
            }
        }
        System.out.println("interrupt :" + interrupted);
        if (interrupted){
            Thread.currentThread().interrupt();
        }

        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){

        }
        System.out.println("main 线程结束");
    }



    @Test
    public void test2(){

        Thread td = new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("线程是否处于中断状态" + Thread.currentThread().isInterrupted());
            }
        });
        td.start();
        td.interrupt();
    }
    @Test
    public void test3(){
        System.out.println(-50/10);
    }
}
