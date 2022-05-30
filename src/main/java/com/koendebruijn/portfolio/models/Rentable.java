package com.koendebruijn.portfolio.models;

public  interface Rentable {
     double calculateRent(int daysRented);
     double calculateInsurance(int daysRented);
}
