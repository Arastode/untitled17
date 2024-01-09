package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("PrivetikiPistoletiki");
        double num1=10;
        double num2=10;
        Del del = new Del();
        Substract min = new Substract();
        Summa plus = new Summa();
        System.out.println(min.minus(num1, num2));
        System.out.println(plus.sum(num1,num2));
        System.out.println(del.del(num1,num2));
    }
}

