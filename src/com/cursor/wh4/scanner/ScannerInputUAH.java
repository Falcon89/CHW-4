package com.cursor.wh4.scanner;

import com.cursor.wh4.Curency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScannerInputUAH implements Curency {


    public void scannerInput() {
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
//        List<Integer> list = new ArrayList<Integer>();
//        System.out.println("Enter number");
//        for (int i=0; i<scanner;i++) {
//            System.out.println(i);
//        }
        int i = 0;
        long tot = 0;
        while (i >= b) {

            i += ONE_HRYVNIA;
//            tot += i;
            System.out.println("Number :" + i + "  ,sum=" + tot);
            break;
        }
        while (i < b) {
            i += TWO_HRYVNIA;
            System.out.println("Number :" + i + "  ,sum=" + tot);
            break;
        }
        while (i < b) {
            i += FIVE_HRYVNIA;
            System.out.println("Number :" + i + "  ,sum=" + tot);
            break;
        }


    }
}
