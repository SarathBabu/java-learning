package com.sarath.utils;

import com.sun.xml.internal.ws.util.StringUtils;
import java.util.Arrays;
import java.util.stream.Collectors;

public class CustomStringUtils {

  public static String capitalizeName(String name) {
    return Arrays.stream(name.split(" ")).sequential()
        .map(StringUtils::capitalize).collect(Collectors.joining(" "));
  }

}
