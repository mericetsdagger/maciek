package org.Exercises.w3resource_exercises;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Display_the_current_data_time {
    public static void main(String[] args) {
        SimpleDateFormat data = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        data.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("CET")));

        System.out.println("Now " + data.format(System.currentTimeMillis()));
    }
}
