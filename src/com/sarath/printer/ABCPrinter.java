package com.sarath.printer;

public class ABCPrinter implements LowDensityPrinter, HDPrinter {

  @Override
  public Photo printLD(String url) {
    return new Photo();
  }

  @Override
  public Photo printHD(String url) {
    return new Photo();
  }
}
