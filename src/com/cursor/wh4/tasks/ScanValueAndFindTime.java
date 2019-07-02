package com.cursor.wh4.tasks;

import java.util.Scanner;

import static com.cursor.wh4.tasks.ProcessInputValue.listBanknotes;

/**
 * Created by Vasyl Kachala on 01.07.2019.
 */
public class ScanValueAndFindTime {
    /**
     * Create method getValueAndNanoTime add Scanner value and show nano.Time
     */
    public static void getValueAndNanoTime() {
        System.out.println("Enter value in range 24565 -- 35789");
        Scanner scanner = new Scanner(System.in);
        int sumUah = scanner.nextInt();
        long startTime = System.nanoTime();
        listBanknotes(sumUah);
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        System.out.println("==========================================");
        System.out.println("Time program execution " + " for sum " + sumUah + " = " + time + " time");
        System.out.println("==========================================");
    }
}
