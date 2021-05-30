package com.sarath.encription;

/**
 * Encryptor class allows the user to perform different encryption algorithms on strings
 */
public class Encryptor {

  private int selectedAlgorithm = -1;
  private String encryptionKey = null;
  public static final int AES = 100;
  public static final int DES = 101;
  public static final int RSA = 102;

  // Magic Numbers

  public void setSelectedAlgorithm(int selectedAlgorithm) {
    this.selectedAlgorithm = selectedAlgorithm;
  }

  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }

  /**
   * Encrypts the given string
   *
   * @param toEncrypt String to encrypt
   * @return Encrypted string
   */
  public String encrypt(String toEncrypt) {

    if (encryptionKey != null) {
      switch (selectedAlgorithm) {
        case AES:
          return executeAlgorithmAes(toEncrypt, encryptionKey);
        case DES:
          return executeAlgorithmDes(toEncrypt, encryptionKey);
        case RSA:
          return executeAlgorithmRsa(toEncrypt, encryptionKey);
      }
    }
    return toEncrypt;
  }

  private String executeAlgorithmRsa(String toEncrypt, String encryptionKey) {
    return "Encrypted using Algorithm RSA";
  }

  private String executeAlgorithmDes(String toEncrypt, String encryptionKey) {
    return "Encrypted using Algorithm DES";
  }

  private String executeAlgorithmAes(String toEncrypt, String encryptionKey) {
    return "Encrypted using Algorithm AES";
  }


}
