package com.servertoclient;
import java.io.DataOutputStream;
import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws Exception{
        ServerSocket ss= new ServerSocket(7777);
        System.out.println("mainserver");

            Socket s = ss.accept();
        System.out.println("connected---------");
        FileInputStream fin=new FileInputStream("C:\\Users\\girijeshts\\Desktop\\send.txt");
        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
        int r;
        while((r=fin.read())!=-1)
        {
            dout.write(r);

        }
        System.out.println("\n File transfer complited");
        s.close();
        ss.close();

    }
}
