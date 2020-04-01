package com.itheima.socketdemo7;

import java.io.*;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",10001);

        OutputStream os = socket.getOutputStream();
        os.write("hello".getBytes());
        //os.close()；如果在这里关流，会导致整个socket都无法使用
        socket.shutdownOutput();//紧紧关闭输出流，并写一个结束的标记，对socket没有任何影响
/*        InputStream is = socket.getInputStream();
        int b ;
        while ((b = is.read())!= -1){
            System.out.println((char)b);
        }
        */
        BufferedReader buf = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line;
        while ((line = buf.readLine())!=null) {
            System.out.println(line);
        }
        buf.close();
        os.close();
        socket.close();
    }
}
