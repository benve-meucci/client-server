package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws UnknownHostException, IOException {
        Socket s = new Socket("localhost", 3000);
        System.out.println("Connected.");
        BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter out = new PrintWriter(s.getOutputStream(), true);
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Insert string:");
        String myString = keyboard.nextLine();
        out.println(myString);
        String result = in.readLine();
        System.out.println("Received: " + result);
    }
}