package com.infy.scannerdemo;

import java.util.Scanner;

public class ScannerDemo {
    public void testScanner() {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Roll No: ");
        int rollNo = inp.nextInt();
        System.out.println(rollNo);
        inp.close();
    }
}
