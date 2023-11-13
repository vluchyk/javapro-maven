package com.gmail.luchyk.viktoriia.hw14;

import com.gmail.luchyk.viktoriia.hw14.enums.Message;
import com.gmail.luchyk.viktoriia.hw14.service.ServerService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ServerService server = new ServerService(8081);
        try {
            server.listen();
        } catch (IOException e) {
            System.out.println(Message.SERVER_IS_NOT_AVAILABLE.getMessage());
        }
    }
}