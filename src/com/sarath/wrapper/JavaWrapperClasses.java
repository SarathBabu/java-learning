package com.sarath.wrapper;

import java.math.BigDecimal;
import java.math.BigInteger;

public class JavaWrapperClasses {


  public static void main(String[] args) {

    Integer a = 10;  // Boxing
    int c = a;  // Unboxing

    // Integer

    Integer x = Integer.max(12, 89);
    System.out.println("Max " + x);

    Integer y = Integer.compare(12, 78);
    System.out.println("Compare " + y);

    Integer z = Integer.parseInt("100");
    System.out.println("Pased " + z);

    Integer xz = Integer.reverse(1234);
    System.out.println("Reverse " + xz);

    Integer xy = Integer.sum(23, 12);   // Lambda functions

    Integer ty = Integer.valueOf("4567");

    String re = Integer.toString(1234);
    System.out.println(re);

    Integer as = ty + xy;

    // Float

    Float fd = Float.parseFloat("3536.675");
    System.out.println("Float parse " + fd);

    String qw = Float.toHexString(12);
    System.out.println(qw);

    Float we = 355f;

    // Long

    Long la = 1314L;

    System.out.println(Long.toBinaryString(1345L));

    // Double

    Double da = 134.0;
    System.out.println(da);

    // Boolean

    Boolean ba = false;
    System.out.println(ba);

    Boolean bb = Boolean.logicalXor(true, true);
    System.out.println(bb);

    // BigInteger

    // long lf= 34346345756765756756L;

    BigInteger bi = new BigInteger("343463445356456475675675756765756756");
    System.out.println(bi);

    BigInteger b1 = BigInteger.valueOf(2);
    bi = bi.add(b1);

    System.out.println(bi);

    System.out.println(bi.divide(BigInteger.valueOf(2)));

    System.out.println(bi);

    System.out.println(bi.multiply(BigInteger.valueOf(2134234545657546756L)));

    // BigDecimal
    // float double are not accurate

    BigDecimal bd = BigDecimal.valueOf(
        3405975093749579475749579275907479723957923749579384573577345775734753757345324342342342423423424242342342423423423423423244.0);

    System.out.println(bd);

    BigDecimal bd1 = new BigDecimal("897.50");
    System.out.println(bd1);

    BigDecimal bdc = bd1.negate();
    System.out.println(bd1);
    System.out.println(bdc);

    // Float, Long, Integer, Double, Boolean - Wrapper classes
    // BigInteger, BigDecimal

  }
}
