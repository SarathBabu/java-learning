package com.sarath.genericstwo;

public class GenericsDataHolder<T> {

  private T data;

  public GenericsDataHolder(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
