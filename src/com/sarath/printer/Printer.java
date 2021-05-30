package com.sarath.printer;

public interface Printer {

  Photo printLD(String url);

  Photo printHD(String url);

  Photo print4K(String url);

}
