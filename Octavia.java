package com.Scr;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Octavia extends Frame {
    private final int timer = 47500;
    protected Octavia() throws AWTException {
    }

    @Override
    public void run() {
        while (!checkThread) {
            try {
                synchronized (Frame.class) {
                    System.out.println("Start Okti");
                    press(KeyEvent.VK_3);
                    Thread.sleep(500);
                }
                Thread.sleep(timer - 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
