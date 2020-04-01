package com.itheima.socketdemo8;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10001);

        Socket accept = serverSocket.accept();

        //网络中的流，从客户端读取数据的
        BufferedInputStream bis = new BufferedInputStream(accept.getInputStream());
        //本地中的IO流，把数据写到本地
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\IDEA\\socket\\serverDir\\copy.jpg"));

        int b ;
        while ((b = bis.read())!=-1) {
            bos.write(b);
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bw.write("上传完成！");
        bw.newLine();
        bw.flush();

        bos.close();
        accept.close();
        serverSocket.close();
    }
}
