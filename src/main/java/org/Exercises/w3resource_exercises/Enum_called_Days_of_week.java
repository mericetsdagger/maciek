package org.Exercises.w3resource_exercises;

import java.time.DayOfWeek;

public class Enum_called_Days_of_week {
    public enum Days {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
    }

    public static void main(String[] args) {
        Days today = Days.TUESDAY;
        System.out.println("Today is: " + today);
    }
}
