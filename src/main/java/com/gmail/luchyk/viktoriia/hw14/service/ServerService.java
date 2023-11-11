package com.gmail.luchyk.viktoriia.hw14.service;

import com.gmail.luchyk.viktoriia.hw14.enums.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
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
            System.out.printf("Server Info: host %s, %s.\n", serverSocket.getLocalSocketAddress(), ip);

            Socket clientSocket = serverSocket.accept();

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
