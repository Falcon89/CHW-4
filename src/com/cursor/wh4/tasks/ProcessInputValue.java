package com.cursor.wh4.tasks;

import com.cursor.wh4.tasks.currency.Currency;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vasyl Kachala on 02.07.2019.
 */
public class ProcessInputValue implements Currency {
    /**
     * Create method ProcessInputValue implements Currency
     *
     * @param value
     */
    public static void listBanknotes(int value) {
        int[] uah = {FIVE_HUNDRED_HRYVNIA, TWO_HUNDRED_HRYVNIA, ONE_HUNDRED_HRYVNIA, FIFTY_HRYVNIA, TWENTY_HRYVNIA, TEN_HRYVNIA, FIVE_HRYVNIA, TWO_HRYVNIA, ONE_HRYVNIA};
        List<Integer> list = new ArrayList<>(uah.length);
        for (int i : uah) {
            list.add(Integer.valueOf(i));
        }
        for (int calculator : list) {
            if (value >= calculator) {
                value = processOutSumBanknote(value, calculator);
            }
        }
        System.out.println("You have money in denomination " + list);
    }

    /**
     * Create method ProcessInputValue implements Currency
     *
     * @param inputValue
     * @param listBanknote
     * @return
     */
    public static int processOutSumBanknote(int inputValue, int listBanknote) {
        int valueBanknote;
        int outputSumValue;
        int value;
        valueBanknote = inputValue % listBanknote;
        outputSumValue = inputValue - valueBanknote;
        inputValue = valueBanknote;
        value = outputSumValue / listBanknote;
        System.out.println("You need to ==> " + value + " bills of " + listBanknote);
        return inputValue;
    }
}
