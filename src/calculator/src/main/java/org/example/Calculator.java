package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator
{
    private static Logger logger;
    public static final String TEXT_RED = "\u001B[38;5;196m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_GREEN = "\u001B[38;5;46m";
    public static final String TEXT_BLUE = "\u001B[38;5;33m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_PURPLE = "\u001B[38;5;128m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_YELLOW = "\u001B[38;5;220m";
    public static final String TEXT_WHITE = "\u001B[37m";



    Calculator()
    {
        logger  = LogManager.getLogger(Calculator.class);
    }

    public static void introLogo()
    {
//        https://www.itsupportwale.com/blog/print-awesome-ascii-text-in-linux-terminal/
//        https://www.w3schools.blog/java-console-and-terminal-color
//        https://gist.github.com/fnky/458719343aabd01cfb17a3a4f7296797
        System.out.println("\u001B[1m"); // bold starts
        System.out.println(TEXT_GREEN+"____ ___  ____    _  _ _ _  _ _    ___  ____ ____  _ ____ ____ ___");
        System.out.println("[__  |__] |___    |\\/| | |\\ | |    |__] |__/ |  |  | |___ |     |");
        System.out.println("___] |    |___    |  | | | \\| |    |    |  \\ |__| _| |___ |___  |");


        System.out.println("____ ____ _ ____ _  _ ___ _ ____ _ ____    ____ ____ _    ____ _  _ _    ____ ___ ____ ____    _ _ _ _ ___ _  _    ___  ____ _  _ ____ ___  ____");
        System.out.println("[__  |    | |___ |\\ |  |  | |___ | |       |    |__| |    |    |  | |    |__|  |  |  | |__/    | | | |  |  |__|    |  \\ |___ |  | |  | |__] [__");
        System.out.println("___] |___ | |___ | \\|  |  | |    | |___    |___ |  | |___ |___ |__| |___ |  |  |  |__| |  \\    |_|_| |  |  |  |    |__/ |___  \\/  |__| |    ___]");

    }


    public static double squareRoot(double num1)
    {
        double result = Math.sqrt(num1);

        logger.info("[SQUARE ROOT] " + num1);
        logger.info("[RESULT SQUARE ROOT] " + result);

        return result;
    }


    public static void main(String[] args)
    {
        introLogo();

        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        do
        {
            System.out.println("\n\n\n\n");
            // Printing menu of the operations
            System.out.println(TEXT_BLUE+"Below is the menu of options, please select the appropriate options:");
            System.out.println("Enter 1 for Square root");
            System.out.println("Enter 2 for Factorial");
            System.out.println("Enter 3 for Natural logarithm (base е)");
            System.out.println("Enter 4 for Power of a number");
            System.out.println("Enter any other integer to exit");
            System.out.print("Enter your choice : " + TEXT_YELLOW);
            int ch = 0;

            int err = 0;
            try
            {
                ch = sc.nextInt();
            }
            catch (InputMismatchException error)
            {
                System.out.println(TEXT_RED+"Entered type is not a number");
                sc.nextLine();
                logger.info("[ERROR] Input Type Incorrect" );
                err = 1;
            }

            if(err == 1)
            {
                continue;
            }

            switch (ch)
            {
                // Finding Square Root of a number
                case 1:
                    System.out.print(TEXT_BLUE+"Enter the number : "+TEXT_YELLOW);
                    double num1 = sc.nextDouble();
                    System.out.println(TEXT_GREEN+"\n\nResult : " + squareRoot(num1)+"\n***********************************");
                    break;
                default:
                    System.out.println(TEXT_RED+"\n\nExiting The Scientific Calculator with DevOps");
                    return;

            }
        }while (true);

    }
}