package org.bruteforce;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        // if the first number: 0 and the last number: 99 999 999 ==> 858mb in Notepad/file size
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        Integer firstNumber = input.nextInt();
        System.out.print("Input the last number: ");
        Integer lastNumber = input.nextInt();

        //For Write
        Numerical.FileWriter(firstNumber, lastNumber);

        //For Read the file from the terminal
        Numerical.FileReader();

        //For to get file size
        System.out.println(Numerical.getFileSize());
    }
}