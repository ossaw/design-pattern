package com.github.mediator;

import java.util.Date;

public class ChatRoom {
    private ChatRoom() {}

    public static void showMessage(User user, String message) {
        System.out.println(new Date().toString() + " [" + user.getName()
                + "] : " + message);
    }
}
