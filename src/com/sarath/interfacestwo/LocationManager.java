package com.sarath.interfacestwo;

import java.util.ArrayList;
import java.util.List;

public class LocationManager {


  private List<LocationManagerListener> subscribers = new ArrayList<>();

  public void startTrackingLocation() {
    // Some code to get the GPS live data from the device;

    // On location change notify consumers

    for (LocationManagerListener subscriber: subscribers){
      subscriber.onLocationChange(78.9, 76.89);
    }

  }

  public void subscribe(LocationManagerListener listener) {
    this.subscribers.add(listener);
  }

  public void unSubscribe(LocationManagerListener listener) {
    this.subscribers.remove(listener);
  }


  public void stopTrackingLocation() {

  }


  interface LocationManagerListener {

    void onLocationChange(double latitude, double longitude);
  }
}
