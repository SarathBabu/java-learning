package com.sarath.arrays;

import java.util.Arrays;

public class JavaArrays {

  public static void main(String[] args) {

    int[] numbers = new int[10];

    for (int i = 0; i < 10; i++) {
      System.out.println(numbers[i]);
    }

    int[] nums = {71, 62, 53, 44, 35, 26, 17};
    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }

//    String[] strs = {"abc", "xyz"};
//
//    String[][] strings = {{"erer", "ewr"}, {"ghfgh", "sdff"}};
//
//    for (int i = 0; i < 2; i++) {
//      for (int j = 0; j < 2; j++) {
//        System.out.println(strings[i][j]);
//      }
//    }
//
//    String[] splitted = "a,b,c,d,e,f".split(",");
//
//

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }
    System.out.println("------------------");
    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      System.out.println(nums[i]);
    }

    System.out.println(Arrays.binarySearch(nums, 9));


  }

}
