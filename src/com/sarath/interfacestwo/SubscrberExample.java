package com.sarath.interfacestwo;

import com.sarath.interfacestwo.LocationManager.LocationManagerListener;

public class SubscrberExample {

  public static void main(String[] args) {

    LocationManager locationManager = new LocationManager();

    locationManager.subscribe(new LocationManagerListener() {
      @Override
      public void onLocationChange(double latitude, double longitude) {
        System.out.printf("Sub1: %f %f\n", latitude, longitude);
      }
    });

    locationManager.subscribe(new LocationManagerListener() {
      @Override
      public void onLocationChange(double latitude, double longitude) {
        System.out.printf("Sub2: %f %f\n", latitude, longitude);
      }
    });

    locationManager.subscribe(new LocationManagerListener() {
      @Override
      public void onLocationChange(double latitude, double longitude) {
        System.out.printf("Sub3: %f %f\n", latitude, longitude);
      }
    });

    locationManager.startTrackingLocation();

  }
}
