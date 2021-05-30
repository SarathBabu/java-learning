package com.sarath.printer;

public class CannonPrinter implements LowDensityPrinter, UltraDensityPrinter {

  @Override
  public Photo printLD(String url) {
    return new Photo();
  }

  @Override
  public Photo printHD(String url) {
    return new Photo();
  }

  @Override
  public Photo print4K(String url) {
    return new Photo();
  }
}
