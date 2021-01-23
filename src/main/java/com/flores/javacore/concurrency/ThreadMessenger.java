package com.flores.javacore.concurrency;

/***
 *
 * Helper class to print a message in Sdt out.
 *
 */
public class ThreadMessenger {


    public static void threadMessage(String importantInfo) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n",threadName,importantInfo);
    }
}
