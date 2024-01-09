package org.example;

public class Summa implements Plus{
    @Override
    public double sum(double num1, double num2) {
        double x = num1 + num2;
        return x;
    }
}
