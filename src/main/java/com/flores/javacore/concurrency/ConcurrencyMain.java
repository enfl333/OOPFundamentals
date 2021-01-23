package com.flores.javacore.concurrency;

/**
 * The following example brings together some of the concepts of this section.
 * SimpleThreads consists of two threads. The first is the main thread that every Java application has.
 * The main thread creates a new thread from the Runnable object, MessageLoop, and waits for it to finish.
 * If the MessageLoop thread takes too long to finish, the main thread interrupts it.
 *
 * The MessageLoop thread prints out a series of messages. If interrupted before it has printed all its messages,
 * the MessageLoop thread prints a message and exits.
 */
public class ConcurrencyMain {

    // A time that will be interrupted
    static long patienceInterrupt = 1000*10;
    //Default an hour
    static long patienceNeverInterrupt = 1000*60*60;

    static long patience = patienceNeverInterrupt;

    public static void main(String[] args) throws InterruptedException {

        print("Starting messageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread thread = new Thread(new MessageLoop());
        thread.start();
        print("Waiting for MessageLoop thread to finish");
        while (thread.isAlive()){
            print("Still waiting");
            thread.join(1000);
            long currentTime = System.currentTimeMillis();

            //If waiting past patience
            if((currentTime-startTime>patience) && thread.isAlive()){
                print("Tired of waiting!");
                thread.interrupt();
                thread.join();
            }
        }
        print("Finally!");
    }


    private static void print(String aMessage){
        ThreadMessenger.threadMessage(aMessage);
    }

}
