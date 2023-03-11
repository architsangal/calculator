package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Calculator
{
    private Logger logger;

    Calculator()
    {
        logger  = LogManager.getLogger(Calculator.class);
    }

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
    }
}