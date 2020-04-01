package com.itheima.socketdemo6;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        //1.创建Socket对象
        ServerSocket ss = new ServerSocket(10001);
        //2.等待客户端连接
        Socket socket = ss.accept();
        //3.获得输入流对象
        InputStream inputStream = socket.getInputStream();
        int b;
        while ((b = inputStream.read()) != -1){
            System.out.print((char)b);
        }
        //4.释放资源
        inputStream.close();
        ss.close();
    }

}
