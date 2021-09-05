package com.Scr;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ZenyrikCharge extends Frame{

    protected ZenyrikCharge() throws AWTException {
    }

    @Override
    public void run() {
        while (!checkThread) {
            try {
                synchronized (Frame.class) {
                    System.out.println("StartZen");
                    press(KeyEvent.VK_5);
                    Thread.sleep(200);
                    press(KeyEvent.VK_CONTROL, KeyEvent.VK_SPACE);
                    Thread.sleep(200);
                    press(KeyEvent.VK_5);
                    Thread.sleep(700);
                }
                Thread.sleep(30000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
