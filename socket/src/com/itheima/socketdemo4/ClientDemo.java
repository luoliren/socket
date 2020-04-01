package com.itheima.socketdemo4;

import java.io.IOException;
import java.net.*;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        InetAddress address = InetAddress.getByName("224.0.1.0");
        int port = 10000;
        String s = "hello 组播";
        byte [] bytes = s.getBytes();

        DatagramPacket dp = new DatagramPacket(bytes,bytes.length,address,port);

        ds.send(dp);

        ds.close();

     }
}
