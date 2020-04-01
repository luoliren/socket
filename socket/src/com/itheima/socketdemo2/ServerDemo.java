package com.itheima.socketdemo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo {
    //注意点：
        //1.要先运营接收端的，在运行发送端
        //2.如果接受端再启动之后，没有接受到数据的，那么会死等（阻塞）
        //3.在接受数据的时候，与要点用一个getLength（）的方法，表示收到了多少字节
    public static void main(String[] args) throws IOException {
        //1.找码头  ---表示接收端从10000端口接受数据的
        DatagramSocket ds = new DatagramSocket(10000);
        //2.创建一个新的箱子
        byte [] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes,bytes.length);
        //3。接受礼物，把礼物放到新的箱子里面
        System.out.println("------接受前---------");
        ds.receive(dp);
        System.out.println("---- -接受后--------");
        //4.从新的箱子里面获取礼物
        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println(new String(data,0,length));
        //5.拿完走羊
        ds.close();
    }
}
