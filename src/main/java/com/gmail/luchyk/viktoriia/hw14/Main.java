package com.gmail.luchyk.viktoriia.hw14;

import com.gmail.luchyk.viktoriia.hw14.service.ServerService;

public class Main {
    public static void main(String[] args) {
        ServerService server = new ServerService(8081);
        server.listener();
    }
}
