import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.Scanner;
import java.util.Scanner;

public class Days {


    static int leapYear(int year) {
        int leap;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            leap = 1;
        }
        else {
            leap = 0;
        }
        return leap;
    }

    static int daysBefore(int month, int day, int year){
        int days = 0;
        int monthDays[] = new int[] {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (leapYear(year) == 1){
            monthDays[1] = 29;
        }
        for (int b = 0; b < month - 1; b++){
            days = days + monthDays[b];
        }
        days = days + day;
        return days;
    }
    public static void main(String[] args) {
//Birth date
        int birthMonth = 0;
        int birthDay = 0;
        int birthYear = 0;

//Due date
        int dueMonth = 0;
        int dueDay = 0;
        int dueYear = 0;

//(1) Calculate years lived
        int yearsLived = dueYear - birthYear + 1;

//(2) Calculate leap years
        int leapYears = 0;
        for (int year = birthYear; year < dueYear+1; year++)
        {
            leapYears = leapYears + leapYear(year);
        }

//(3) Calculate the number of days in your birth year before birth
        int daysBeforeBirth = daysBefore(birthMonth, birthDay, birthYear);

//(4) Calculate the number of days remaining in the current year after the due date
        int daysRemaining = 365 - daysBefore(dueMonth, dueDay, dueYear);

//Calculate days lived
        int days = 0;
        days = days + (365 * yearsLived);
        days = days + leapYears;
        days = days - daysBeforeBirth;
        days = days - daysRemaining;
    }
}