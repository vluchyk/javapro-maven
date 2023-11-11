package com.gmail.luchyk.viktoriia.hw14.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Message {
    SERVER_STARTED("The server is running.");
    private String message;
}