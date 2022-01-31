package server;

import util.SocketUtil;

public class ReadThreadServer implements Runnable {

    Thread t;
    SocketUtil socketUtil;

    public ReadThreadServer(SocketUtil socketUtil){
        this.socketUtil = socketUtil;
        this.t = new Thread(this);
        t.start();
    }

    @Override
    public void run(){
        while (true){
//            System.out.println("Client: ");
            try {
                System.out.println("Client: " + this.socketUtil.readSocket());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
