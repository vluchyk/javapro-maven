package com.gmail.luchyk.viktoriia.hw14.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Message {
    SERVER_STARTED("The server is running."),
    SERVER_STOPPED("The server is stopped."),
    CLIENT_CONNECTED("The client is connected."),
    SERVER_HELLO("Server: Привіт!"),
    SERVER_GOODBYE("Server: Good bye!"),
    SERVER_QUESTION("Server: Що таке паляниця?"),
    SERVER_QUESTION_ANSWER("Хліб");

    private String message;
}