package com.zh.myio;

import java.io.*;

/**
 * @author Zhaohui
 * @date 2020/5/29
 */
public class IOTest {
    public static void main(String[] args) {
        try {
            InputStream fileInputStream = new FileInputStream("data.txt");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int i;
            while ((i = fileInputStream.read()) != -1)
                System.out.println(i);
            dataInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
