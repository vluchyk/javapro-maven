package com.gmail.luchyk.viktoriia.hw14.service;

import com.gmail.luchyk.viktoriia.hw14.enums.Message;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.SocketException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class DataService {
    private Socket socket;

    public void chart() {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
             PrintWriter out = new PrintWriter(socket.getOutputStream(), true)) {

            System.out.println(Message.SERVER_HELLO.getMessage());
            out.println(Message.SERVER_HELLO.getMessage());

            String receivedData;
            boolean verify = false;
            while ((receivedData = in.readLine()) != null) {
                System.out.println("Client: " + receivedData);

                if (verify && !Message.SERVER_QUESTION_ANSWER.getMessage().equalsIgnoreCase(receivedData)) break;
                if (containRussianLetters(receivedData)) {
                    verify = true;
                    System.out.println(Message.SERVER_QUESTION.getMessage());
                    out.println(Message.SERVER_QUESTION.getMessage());
                } else {
                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
                    String formatDateTime = now.format(formatter);
                    System.out.println(formatDateTime);
                    out.println(formatDateTime);
                    System.out.println(Message.SERVER_GOODBYE.getMessage());
                    out.println(Message.SERVER_GOODBYE.getMessage());
                    break;
                }

            }
        } catch (SocketException e) {
            System.out.println("Connection reset.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private boolean containRussianLetters(String message) {
        List<String> russianLetters = Arrays.asList("ы", "ъ", "э", "ё");
        return russianLetters.stream()
                .anyMatch(letter -> message.contains(letter.toLowerCase()));
    }
}