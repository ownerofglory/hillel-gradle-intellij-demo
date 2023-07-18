package ua.ithillel.gradle;

import ua.ithillel.gradle.calc.Calculator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Starting application...");

        Calculator calculator = new Calculator();
        double add = calculator.add(1, 4);
        System.out.println("Application finished");
    }
}