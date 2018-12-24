package com.github.observer;

import java.util.Date;

public class TimeObsever implements Observer {

    @Override
    public void receiveNotification(String action) {
        System.out.println(new Date() + " " + action);
    }

}
