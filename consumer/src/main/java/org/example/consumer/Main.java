package org.example.consumer;

import org.example.service.CurencyConverter_SvKr;

import java.util.Scanner;
import java.util.ServiceLoader;


public class Main {


    public static void main (String []args){
        System.out.println("Welcome to the best exchange agency ever! Enter the amount of SEK you want to exchange: ");
        Scanner scanner = new Scanner(System.in);
        String sekAmount = scanner.nextLine();


        ServiceLoader <CurencyConverter_SvKr> loader = ServiceLoader.load(CurencyConverter_SvKr.class);

        for(CurencyConverter_SvKr service: loader){
            System.out.println(service.convertToKr(sekAmount));
        }
    }
}
