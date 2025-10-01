package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        ServerSocket mioserver= new ServerSocket(3000);
        Socket mioSocket = mioserver.accept();
        System.out.println("qualcuno si e collegato");
        
    }
}