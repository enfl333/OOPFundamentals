package com.flores.javacore.concurrency;

/***
 * Concurrency class example to run a message in a separate Thread
 * a message with a 4s pause.
 *
 */
public class MessageLoop implements Runnable{

    @Override
    public void run() {
        String importantInfo[] = {
                "A Message from the president!",
                "My fellow Americans, today is a historical day.",
                "You have elected a complete idi*t as your president.",
                "As I will prove time after time I won't let you down"
        };
        try{
            for (int i = 0; i < importantInfo.length; i++) {
                Thread.sleep(4000);
                String s = importantInfo[i];
                ThreadMessenger.threadMessage(s);
            }

        }catch (InterruptedException e){
            ThreadMessenger.threadMessage("I wasn't done!");
        }

    }

}
