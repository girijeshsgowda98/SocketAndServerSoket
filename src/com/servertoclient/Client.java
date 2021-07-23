package com.servertoclient;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException{
        Socket s=new Socket("127.0.0.1",7777);
        if(s.isConnected())
        {
            System.out.println("Conneected to server");
        }
        FileOutputStream fout=new FileOutputStream("C:\\Users\\girijeshts\\Desktop\\received.txt");
        DataInputStream din= new DataInputStream(s.getInputStream());
        int r;
        while((r=din.read())!=-1)
        {
            fout.write((char)r);

        }s.close();
    }
}
