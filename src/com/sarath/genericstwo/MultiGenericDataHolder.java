package com.sarath.genericstwo;

public class MultiGenericDataHolder<T, U, V> {

  private T tData;

  private U uData;

  private V vData;

  public T gettData() {
    return tData;
  }

  public void settData(T tData) {
    this.tData = tData;
  }

  public U getuData() {
    return uData;
  }

  public void setuData(U uData) {
    this.uData = uData;
  }

  public V getvData() {
    return vData;
  }

  public void setvData(V vData) {
    this.vData = vData;
  }
}
