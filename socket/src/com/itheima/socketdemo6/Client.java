package com.itheima.socketdemo6;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        //1.创建一个Socket对象
        Socket socket = new Socket("127.0.0.1",10001);
        //2.获取一个io流开始写数据
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello".getBytes());
        //3.释放资源
        outputStream.close();
        socket.close();

    }
}
