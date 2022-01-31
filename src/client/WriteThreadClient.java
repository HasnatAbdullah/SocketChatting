package client;

import util.SocketUtil;

import java.util.Scanner;

public class WriteThreadClient implements Runnable {

    SocketUtil socketUtil;
    Thread t;

    public WriteThreadClient(SocketUtil socketUtil){
        this.socketUtil = socketUtil;
        this.t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        while (true){
            System.out.println("Enter message for the server: ");
            Scanner scanner = new Scanner(System.in);
            String str = scanner.nextLine();
            try {
                this.socketUtil.writeSocket(str);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
