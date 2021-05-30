package com.sarath.printer;

public class XYZPrinter implements UltraDensityPrinter {

  @Override
  public Photo printHD(String url) {
    return new Photo();
  }

  @Override
  public Photo print4K(String url) {
    return new Photo();
  }
}
