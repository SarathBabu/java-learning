package com.sarath.temporal;

import java.io.BufferedReader;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateExample {

  public static void main(String[] args) {

    // GMT  =
    // UTC = GMT
    // IST  =  GMT + 5:30

    // 1970 Jan 1 00:00 GMT  - Epoch  (year, month, day)

    // Julian Date   1 2 3 4 5..........
//
//    Date date = new Date();
//    System.out.println(date);
//    System.out.println(date.getTime());
//    Date dateFromMillis = new Date(1700000000000L);
//    System.out.println(dateFromMillis);
//    System.out.println(dateFromMillis.before(date));
//
//    Date date2 = new Date(110, 0, 12);
//    System.out.println(date2);
//
//    Date dateToStore = new Date();

 //   dateFromMillis.getTime(); // Store
    // store

    Date dateFromMillis2 = new Date(1700000000000L);

    // Calender

    Calendar calendar = Calendar.getInstance();   // Mutable
    System.out.println(calendar.getTime());
//    Calendar calendar1 = Calendar.getInstance(TimeZone.getTimeZone("GMT+2:00"));
//    System.out.println(calendar1.getTime());


   // calendar.add(Calendar.DATE, 100);
    //calendar.add(Calendar.MONTH, -100);

   // calendar.set(Calendar.DAY_OF_MONTH, 29);
    calendar.set(Calendar.MONTH, 1000);
    System.out.println(calendar.getTime());

    System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));

    System.out.println(calendar.getTimeZone());


//    BigInteger value = BigInteger.valueOf(23L);  // Immutable
//    BigInteger newValue  = value.add(new BigInteger("24"));

    // String Literals  "hjhj"

    GregorianCalendar calendar1 = new GregorianCalendar();



    // LocalDate
    LocalDate localDate =  LocalDate.now();
    System.out.println(localDate);

    LocalDate newLocaldtae = LocalDate.parse("2021-05-29");   // yyyy-MM-DD
    System.out.println(newLocaldtae);

    System.out.println(newLocaldtae.format(DateTimeFormatter.ofPattern("yy-MMM-dd")));


    // parse
    // format

    LocalDateTime localDateTime = LocalDateTime.of(2021, 1, 23, 14, 28);
    System.out.println(localDateTime);

    System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MMM/dd hh:mm a")));





  }

}
