package org.example;

import org.example.jdkhttpclient.HttpClientDemo;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
       // System.out.println("Hello world!");

        HttpClientDemo httpClientDemo  =    new HttpClientDemo();
      String response  =   httpClientDemo.getAllPosts();

        System.out.println(response);

    }
}