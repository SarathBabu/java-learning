package com.sarath.genericstwo;

import com.sarath.pojo.Circle;
import com.sarath.pojo.Rectangle;
import com.sun.tools.javac.util.Pair;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GenericObjectConstructions {


  public static void main(String[] args) {

    GenericsDataHolder<Integer> dataHolder = new GenericsDataHolder<>(34);
    GenericsDataHolder<Float> dataFHolder = new GenericsDataHolder<Float>(34f);
    GenericsDataHolder<String> dataHolder1 = new GenericsDataHolder<String>("asdsdfsdf");



    MultiGenericDataHolder<Integer, Double, Float> holder = new MultiGenericDataHolder<>();


    List<Integer> myList = new ArrayList<>();
    List<Float> myFList = new ArrayList<>();
    List<Circle> myCList = new ArrayList<>();

    Pair<String, Integer> pair = new Pair<>("asas", 234234);


    GenericAddition<BigDecimal> addition = new GenericAddition<>();

    addition.add(new BigDecimal("56"), new BigDecimal("78"));

    GenericAddition<Float> floatGenericAddition = new GenericAddition<>();
    floatGenericAddition.add(34f, 67f);



    AreaCalculator<Circle> calculator = new AreaCalculator<>();
    calculator.area(new Circle(56, "CM"));

    AreaCalculator<Rectangle> calculator1 = new AreaCalculator<>();
    calculator1.area(new Rectangle(45, 78));



  }
}
