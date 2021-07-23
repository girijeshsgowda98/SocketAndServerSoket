package com.clientToserver;

import java.io.DataOutputStream;
import java.io.*;
import java.net.ServerSocket;
import java.net.*;

public class Servers {
    public static void main(String[] args) throws IOException {
        ServerSocket ss= new ServerSocket(4999);
        System.out.println("mainserver");

        Socket s = ss.accept();
        System.out.println("client connected---------");

        InputStreamReader in=new InputStreamReader(s.getInputStream());
        BufferedReader bf=new BufferedReader(in);
        String str=bf.readLine();
        System.out.println("client :"+str);
        PrintWriter pr=new PrintWriter(s.getOutputStream());
        pr.print("yes it is connected");
        pr.flush();

    }
}
