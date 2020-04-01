package com.itheima.socketdemo7;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10001);

        Socket accept = serverSocket.accept();

        InputStream is = accept.getInputStream();
        int b ;
        while ((b = is.read())!= -1) {
            System.out.println((char)b);
        }
        BufferedWriter buf = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        buf.write("你谁呀");
        buf.newLine();
        buf.close();
       /* OutputStream os = accept.getOutputStream();
        os.write("你谁呀".getBytes());*/


        is.close();
        accept.close();
        serverSocket.close();
    }
}
