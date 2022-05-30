package com.koendebruijn.portfolio.models;

public  abstract class Rentable {
     protected abstract double calculateRent(int daysRented);
     protected abstract double calculateInsurance(int daysRented);

     public double getTotalCost(int daysRented, boolean isInsured) {
          double costs = calculateRent(daysRented);

          if (isInsured) {
               costs += calculateInsurance(daysRented);
          }

          return costs;
     }
}
