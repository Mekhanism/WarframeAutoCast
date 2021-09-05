package com.Scr;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CastInviz extends Frame{
    public CastInviz() throws AWTException {
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (!checkThread) {
            try {
                synchronized (Frame.class) {
                    System.out.println("CastInv");
                    inviz();
                }
                Thread.sleep(35000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void inviz() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            press(KeyEvent.VK_CONTROL);
            Thread.sleep(50);
        }
    }
}
