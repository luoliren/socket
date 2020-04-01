package com.itheima.socketdemo1;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class socketDemo1 {
    //static InterAddress getByName(String host)
    //确定主机名称的ip地址，主机名称可以是机器名称，也可以是IP地址
    //String getHostName() 获取此ip地址的主机名称
    //String getHostAddress()返回文本显示中显示的ip地址字符串
    public static void main(String[] args) throws UnknownHostException {

        InetAddress address = InetAddress.getByName("DESKTOP-4BLA00N");

        String hostName = address.getHostName();
        String hostAddress = address.getHostAddress();
        System.out.println(hostName);
        System.out.println(hostAddress);
        System.out.println(address);
    }
}
