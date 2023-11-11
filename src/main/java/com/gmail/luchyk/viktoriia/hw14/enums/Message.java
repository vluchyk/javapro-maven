package com.gmail.luchyk.viktoriia.hw14.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Message {
    SERVER_STARTED("The server is running."),
    CLIENT_CONNECTED("The client is connected.");

    private String message;
}