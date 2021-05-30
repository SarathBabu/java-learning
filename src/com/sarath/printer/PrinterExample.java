package com.sarath.printer;

public class PrinterExample {

  public static void main(String[] args) {

    // UltraDensityPrinter printer = new CannonPrinter();

    UltraDensityPrinter printer = new XYZPrinter();

    System.out.println(printer.print4K(""));

    //printer.printHD("");

    LowDensityPrinter lowDensityPrinter = new ABCPrinter();

  }

}
