package edu.badpals;

public interface PaymentMethod {

    boolean pay(double charge);

    String number();

    String cardOwner();

    double credit();

}