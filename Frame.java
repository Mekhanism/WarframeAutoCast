package com.Scr;

import java.awt.*;

public abstract class Frame extends Thread{
    private final Robot robot = new Robot();
    protected static boolean checkThread = false;
    protected final Object monitor = new Object();


    protected Frame() throws AWTException {
    }

    protected synchronized void press(int key) throws InterruptedException {
        robot.keyPress(key);
        Thread.sleep(100);
        robot.keyRelease(key);
    }

    protected synchronized void press(int key1, int key2) throws InterruptedException {
        robot.keyPress(key1);
        Thread.sleep(100);
        robot.keyPress(key2);
        Thread.sleep(100);
        robot.keyRelease(key1);
        robot.keyRelease(key2);
    }

    public static void close() {
        checkThread = true;
    }

    public static boolean isCheckThread() {
        return checkThread;
    }
}
