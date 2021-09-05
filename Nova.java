package com.Scr;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Nova extends Frame{
    private final int timer = 17000;
    protected Nova() throws AWTException {
    }

    @Override
    public void run() {
        while (!checkThread) {
            try {
                synchronized (Frame.class) {
                    System.out.println("Start Nova");
                    press(KeyEvent.VK_4);
                    Thread.sleep(1000);
                }
                Thread.sleep(timer-1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
