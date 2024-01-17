import java.lang.System;

public class Main {
    public static void main(String[] args) {

        int firstYear = 1924;
        int lastYear = 2024;

        for (int year = firstYear; year <= lastYear; year = year + 1) {
            if(year % 4 == 0){
                System.out.println(year);
                for (int month = 1; month <= 12; month = month + 1){
                    System.out.println("29." + month + "." + year);
                }
            }
        }
    }
}

