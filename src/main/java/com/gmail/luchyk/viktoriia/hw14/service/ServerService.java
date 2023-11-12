package com.gmail.luchyk.viktoriia.hw14.service;

import com.gmail.luchyk.viktoriia.hw14.enums.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

@AllArgsConstructor
@Getter
@Setter
@Data
public class ServerService {
    private int port;

    public void listener() {
        try (ServerSocket serverSocket = new ServerSocket(this.port)) {
            System.out.println(Message.SERVER_STARTED.getMessage());
            InetAddress ip = InetAddress.getLocalHost();
            System.out.printf("Server Info: ip %s, port %s.\n", ip, serverSocket.getLocalPort());

            Socket clientSocket = serverSocket.accept();
            System.out.println(Message.CLIENT_CONNECTED.getMessage());
            System.out.printf("Client Info: %s.\n", clientSocket.getInetAddress().getHostAddress());

            DataService dataService = new DataService(clientSocket);
            dataService.chart();

            clientSocket.close();
            System.out.println(Message.SERVER_STOPPED.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}