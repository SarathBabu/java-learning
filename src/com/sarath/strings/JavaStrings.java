package com.sarath.strings;

import java.math.BigDecimal;

public class JavaStrings {


  public static void main(String[] args) {

    // Strings as are immutable;

    String s = "jsldkjalsdlajsd";
    System.out.println(s);

    String s1 = String.valueOf(27465237);
    System.out.println(s1);

    // Floating point error
    float f1 = 34834.9863f;
    String s2 = String.valueOf(f1);
    System.out.println(s2);

    BigDecimal db1 = new BigDecimal(34834.9863f);
    System.out.println(db1);

    BigDecimal bd2 = new BigDecimal("34834.9863");
    System.out.println(bd2);

    String s3 = String.valueOf(2133434.564334653456);
    System.out.println(s3);

    String s4 = String.format("Sum %d + %d = %d", 21, 2, 23);
    System.out.println(s4);

    String s5 = String.format("%f * %f = %f", 3f, 5f, 8f);
    System.out.println(s5);

    String s6 = String.format("%g - %g", 3d, 7d);
    System.out.println(s6);

    String s7 = String.format("%e - %e", 3d, 7d);
    System.out.println(s7);

    String s8 = String.format("Name: %s %s", "Jyothish", "Babu");
    System.out.println(s8);

    String s9 = String.join(",", "John", "Shyam", "Revi");
    System.out.println(s9);

    System.out.println("Length of s5 is " + s5.length());
    System.out.println(String.format("Length of s5 is %d", s5.length()));
    System.out.printf("Length of s5 is %d\n", s5.length());  // Good choice

    String su = "HELLO WORLD";
    System.out.println(su.toLowerCase());

    String sl = "hi; how are you";
    System.out.println(sl.toUpperCase());

    System.out.println(s5.charAt(9));

    String sc1 = "Hello";
    String sc2 = "Hello";
    String sc3 = "Jello";
    System.out.println(sc1.compareTo(sc2));
    System.out.println(sc1.compareTo(sc3));

    System.out.println((int) 'H');
    System.out.println((int) 'J');

    String df = sc1.concat(sc2);
    System.out.println(sc3.concat(sc2));

    System.out.printf("Is %s contains %s = %s\n", sc2, "w", sc2.contains("w"));
    System.out.printf("Is %s contains %s = %s\n", sc3, "J", sc3.contains("J"));

    System.out.printf("Is %s equal to %s = %s\n", sc1, sc3, sc1.equals(sc3));

    System.out.println("".isEmpty());

    System.out.printf("Is %s equal to %s = %s\n", sc1, "hello", sc1.equalsIgnoreCase("hello"));

    System.out.println(sc3.replace('J', 'h'));

    String hello = "Hello, Satheesh";
    System.out.println(hello.replace("Hello", "Hi"));

    String toTrim = "      Please trim me          ";
    toTrim.trim();
    System.out.println(toTrim.trim());

    String[] names = s9.split(",");
    System.out.println(names.length);

  }

}
