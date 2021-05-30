package com.sarath.encription;

import static com.sarath.encription.Encryptor.RSA;

public class PerformEncryption {


  public static void main(String[] args) {

    Encryptor encryptor = new Encryptor();

    encryptor.setEncryptionKey("My encryption key");
    encryptor.setSelectedAlgorithm(RSA);
    String encryptedString = encryptor.encrypt("Hello World");
    System.out.println(encryptedString);
  }

}
