package client;

import util.SocketUtil;
import util.config;

import java.io.IOException;
import java.net.Socket;

public class client {

    public static void main(String[] args) throws Exception {

        Socket socket = new Socket(config.host, config.port);
        SocketUtil socketUtil = new SocketUtil(socket);
        new ReadThreadClient(socketUtil);
        new WriteThreadClient(socketUtil);
    }

}
