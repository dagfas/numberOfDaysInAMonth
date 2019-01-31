package com.dagmfasil;

public class Main {

    public static void main(String[] args) {
        int result = getDaysInMonth(2,99999);
        System.out.println(result);

    }

    public static boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999) && (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;

        } else {
            return false;
        }


    }

    public static int getDaysInMonth(int month, int year) {
        if ((month < 1) || (month > 12) && (year < 1) || (year > 9999)) {
            return -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                    return 30;
                case 2:
                    if (isLeapYear(year)) {
                        return 29;

                    }
                    return 28;


            }

        }return getDaysInMonth(month,year);
    }

}




