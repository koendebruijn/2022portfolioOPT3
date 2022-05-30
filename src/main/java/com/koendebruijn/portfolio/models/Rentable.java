package com.koendebruijn.portfolio.models;

public  abstract class Rentable {
     abstract double calculateRent(int daysRented);
     abstract double calculateInsurance(int daysRented);
}
