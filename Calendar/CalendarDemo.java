package com.jwetherell.algorithms.MyGit.Date;

/**
 * Created by ganeshmadhu on 1/30/21.
 */

import java.util.Calendar;

/**
 * set of calendar fields such as MONTH, YEAR, HOUR, etc.
 *
 * Calendar class in Java is an abstract class
 *
 * Calendar.getInstance()
 *
 * Calendar.getInstance(TimeZone zone)
 *
 * Calendar.getInstance(Locale aLocale)
 *
 * Calendar.getInstance(TimeZone zone, Locale aLocale)
 *
 * int get(int field)	It is used to return the value of the given calendar field.
 *
 * abstract int getMaximum(int field)	It is used to return the maximum value for the given calendar field of this Calendar instance.
 *
 * Date getTime()	It is used to return a Date object representing this Calendar’s time value.
 *
 * abstract int getMinimum(int field)	It is used to return the minimum value for the given calendar field of this Calendar instance.
 */
public class CalendarDemo {


    public void calendarDemoExample() {

        Calendar calendar = Calendar.getInstance();

        System.out.println("CalendarDemo.calendarDemoExample");

        System.out.println("Year : " + calendar.get(Calendar.YEAR)
                + " Month : " + calendar.get(Calendar.MONTH)
                + " Day : " + calendar.get(Calendar.DATE)
                + "Minute : " + calendar.get(Calendar.MINUTE)
                + "Seconds : " + calendar.get(Calendar.SECOND));

        int Max_Days_In_Week = calendar.getMaximum(Calendar.DAY_OF_WEEK);

        System.out.println("Max Days In a week :" + Max_Days_In_Week);

        int Max_Weeks_in_Year = calendar.getMaximum(Calendar.WEEK_OF_YEAR);

        System.out.println("Max Weeks In a week :" + Max_Weeks_in_Year);

        int Min_Days_In_Week = calendar.getMinimum(Calendar.DAY_OF_WEEK);

        System.out.println("Minimum Days In a week :" + Min_Days_In_Week);

        int Min_Weeks_in_Year = calendar.getMinimum(Calendar.WEEK_OF_YEAR);

        System.out.println("Minimum Weeks In a week :" + Min_Weeks_in_Year);

    }

}
