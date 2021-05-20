package com.cybertek.utelities;

public class browserUtil {

    public void TimeWait(int second) {

        second *= 1000;

        try {
            Thread.sleep(second);
        } catch (InterruptedException e) {
            e.printStackTrace();

            System.out.println("Something happened in sleep method");
        }

    }
}
