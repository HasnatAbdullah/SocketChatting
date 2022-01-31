package client;

import util.SocketUtil;

public class ReadThreadClient implements Runnable {

    Thread t;
    SocketUtil socketUtil;

    public ReadThreadClient(SocketUtil socketUtil){
        this.socketUtil = socketUtil;
        this.t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        while (true){
//            System.out.println("Server: ");
            try {
                System.out.println("Server: " + this.socketUtil.readSocket());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
