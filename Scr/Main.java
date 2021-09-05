package com.Scr;

import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws AWTException, WarframeNotFoundException, IOException, InterruptedException {
        Frame frame;
        Frame charge = new ZenyrikCharge();
        Warframes warframes = Warframes.NOTFOUND;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            switch (reader.readLine()) {
                case "nova" -> warframes = Warframes.NOVA;
                case "octavia" -> warframes = Warframes.OKTAVIA;
                default -> throw new WarframeNotFoundException();
            }

        switch (warframes) {
            case NOVA -> frame = new Nova();
            case OKTAVIA -> frame = new Octavia();
            default -> throw new WarframeNotFoundException();
        }
            while(!Frame.isCheckThread()) {
                switch (reader.readLine()) {
                    case "close" -> Frame.close();
                    case "start" -> {
                        Thread.sleep(3000);
                        frame.start();
                        charge.start();
                    }
                    case "n charge" -> {
                        Thread.sleep(3000);
                        frame.start();
                    }
                    default -> System.out.println("Неверный ввод");
                }
            }





    }
}

