package com.zh.mysocket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * MySocketClient
 *
 * @author Zhaohui
 * @date 2020/5/4
 */
public class MySocketClient {
    public static void main(String[] args) throws IOException {
        int port = 7777;
        String host = "localhost";
        Socket socket = new Socket(host, port);
        DataInputStream dis = new DataInputStream(
                new BufferedInputStream(socket.getInputStream()));
        DataOutputStream dos = new DataOutputStream(
                new BufferedOutputStream(socket.getOutputStream()));
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        while (!flag) {
            System.out.println("请输入正方形的边长:");
            double length = sc.nextDouble();

            dos.writeDouble(length);
            dos.flush();

            double area = dis.readDouble();

            System.out.println("服务器返回的计算面积为:" + area);

            while (true) {
                System.out.println("继续计算？(Y/N)");
                String str = sc.next();
                if (str.equalsIgnoreCase("N")) {
                    dos.writeInt(0);
                    dos.flush();
                    flag = true;
                    break;
                } else if (str.equalsIgnoreCase("Y")) {
                    dos.writeInt(1);
                    dos.flush();
                    break;
                }
            }
        }
        socket.close();
    }
}
