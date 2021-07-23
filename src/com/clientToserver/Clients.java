package com.clientToserver;

import java.io.InputStreamReader;
import java.io.*;
import java.net.*;

public class Clients {
    public static void main(String[] args) throws IOException{
        Socket s=new Socket("127.0.0.1",4999);
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.println("hello is it working");
        pr.flush();
        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader bf=new BufferedReader(in);
        String str=bf.readLine();
        System.out.println("server: "+str);
    }

}
