import java.lang.System;

public class Main {
    public static void main(String[] args) {
        int timaBirthYear = 1993;
        int cavidBirthYear = 2003;

        int firstYear = 1924;
        int lastYear = 2024;


        boolean yearExists = false;
        for (int year = firstYear; year <= lastYear; year = year + 1) {
            if (year == timaBirthYear) {
                yearExists = true;

            }else if(year == cavidBirthYear){
                yearExists = true;
                break;
            }
        }
        String found = "nawol";
        String notfound = "nenawol";
        System.out.println(yearExists ? found : notfound);
    }
}
