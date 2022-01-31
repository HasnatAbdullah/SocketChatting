package server;

import util.SocketUtil;
import util.config;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class server {

    public static void main(String[] args) throws Exception {

        ServerSocket serverSocket = new ServerSocket(config.port);
        System.out.println("server has been started at port: " + config.port);
        while (true){
            Socket socket = serverSocket.accept();
            SocketUtil socketUtil = new SocketUtil(socket);
            new ReadThreadServer(socketUtil);
            new WriteThreadServer(socketUtil);

        }
    }
}
