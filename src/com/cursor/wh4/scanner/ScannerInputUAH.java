package com.cursor.wh4.scanner;

import com.cursor.wh4.Curency;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ScannerInputUAH implements Curency {


    public void scannerInput() {
        int[] money = {ONE_HRYVNIA, TWO_HRYVNIA, FIVE_HRYVNIA, TEN_HRYVNIA, TWENTY_HRYVNIA, FIFTY_HRYVNIA, ONE_HUNDRED_HRYVNIA, TWO_HUNDRED_HRYVNIA, FIVE_HUNDRED_HRYVNIA};
        List<Integer> list = new ArrayList<>(money.length);

        for (int i : money) {
            list.add(Integer.valueOf(i));
        }

        System.out.println(list);
//        Scanner scanner = new Scanner(System.in);
//        int b = scanner.nextInt();
//        List<Integer> list = new ArrayList<Integer>();
//        System.out.println("Enter number");
//        for (int i=0; i<scanner;i++) {
//            System.out.println(i);
//        }
//        int i = 1;
//        long tot = 1;
//        while (i < b) {
//
//            while (i < b) {
//                i += 1;
//                tot += i;
//                System.out.println("Number :" + i + "  ,sum="+tot);
//            }
    }
//        while (i < b) {
//            i += TWO_HRYVNIA;
//            System.out.println("Number :" + i + "  ,sum=" + tot);
//            break;
//        }
//        while (i < b) {
//            i += FIVE_HRYVNIA;
//            System.out.println("Number :" + i + "  ,sum=" + tot);
//            break;
//        }


}
