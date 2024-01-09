package org.example;

    public class Substract implements Minus
    {

        @Override
        public double minus(double num1, double num2)
        {
            double z = num1 - num2;
            return z;
        }
    }