package com.gmail.luchyk.viktoriia.hw14.service;

import com.gmail.luchyk.viktoriia.hw14.enums.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

            try (BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
                String receivedData;
                while((receivedData = in.readLine()) != null) {
                    System.out.println("Received from client: " + receivedData);
                }
            }

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
