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

    private static String inputDouble(Scanner sc)
    {
        int err = 0;
        try
        {
            double ch = sc.nextDouble();
            return ch+"";
        }
        catch (InputMismatchException error)
        {
            System.out.println(TEXT_RED+"Entered type is not a double");
            sc.nextLine();
            logger.info("[ERROR] Input Type Incorrect" );
            err = 1;
        }

        return "no";
    }

    private static double inputInteger(Scanner sc)
    {
        int err = 0;
        try
        {
            int ch = sc.nextInt();
            return ch;
        }
        catch (InputMismatchException error)
        {
            System.out.println(TEXT_RED+"Entered type is not a integer");
            sc.nextLine();
            logger.info("[ERROR] Input Type Incorrect" );
            err = 1;
        }

        return 0.5;
    }
    public static void introLogo()
    {
//        https://www.itsupportwale.com/blog/print-awesome-ascii-text-in-linux-terminal/
//        https://www.w3schools.blog/java-console-and-terminal-color
//        https://gist.github.com/fnky/458719343aabd01cfb17a3a4f7296797
//        https://www.youtube.com/watch?v=tI6Z2hy3B64&ab_channel=TutorialMentor
        System.out.println("\u001B[1m"); // bold starts
        System.out.println(TEXT_GREEN+"____ ___  ____    _  _ _ _  _ _    ___  ____ ____  _ ____ ____ ___");
        System.out.println("[__  |__] |___    |\\/| | |\\ | |    |__] |__/ |  |  | |___ |     |");
        System.out.println("___] |    |___    |  | | | \\| |    |    |  \\ |__| _| |___ |___  |");


        System.out.println("____ ____ _ ____ _  _ ___ _ ____ _ ____    ____ ____ _    ____ _  _ _    ____ ___ ____ ____    _ _ _ _ ___ _  _    ___  ____ _  _ ____ ___  ____");
        System.out.println("[__  |    | |___ |\\ |  |  | |___ | |       |    |__| |    |    |  | |    |__|  |  |  | |__/    | | | |  |  |__|    |  \\ |___ |  | |  | |__] [__");
        System.out.println("___] |___ | |___ | \\|  |  | |    | |___    |___ |  | |___ |___ |__| |___ |  |  |  |__| |  \\    |_|_| |  |  |  |    |__/ |___  \\/  |__| |    ___]");

    }

    private static void menu()
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
    }

    private static double squareRoot(double num1)
    {
        if(num1 < 0)
        {
            logger.info("[SQUARE ROOT] " + num1);
            logger.info("[RESULT SQUARE ROOT] Invalid Input");
            return  -1;
        }

        double result = Math.sqrt(num1);

        logger.info("[SQUARE ROOT] " + num1);
        logger.info("[RESULT SQUARE ROOT] " + result);

        return result;
    }

    private static double factorial(double num1)
    {
        if(num1 < 0)
        {
            logger.info("[FACTORIAL] " + num1);
            logger.info("[RESULT FACTORIAL] Invalid Input");
            return  -1;
        }
        else
        {
            int result = 1;
            for(int i=1;i<=num1;i++)
            {
                result *= i;
            }

            logger.info("[FACTORIAL] " + num1);
            logger.info("[RESULT FACTORIAL]" + result);

            return result;
        }
    }

    private static String natLog(double num1)
    {
        if(num1 < 0)
        {
            logger.info("[NATURAL LOGARITHM] " + num1);
            logger.info("[RESULT NATURAL LOGARITHM] Invalid Input");
            return  "no";
        }
        else
        {
            double result = Math.log(num1);

            logger.info("[NATURAL LOGARITHM] " + num1);
            logger.info("[RESULT NATURAL LOGARITHM]" + result);

            return result+"";
        }
    }

    public static void main(String[] args)
    {
        introLogo();

        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        do
        {
            menu();
            int ch = 0;

            double choice = inputInteger(sc);
            if((int)choice != choice)
            {
                continue;
            }
            else
            {
                ch = (int)choice;
            }

            double num1, num2, result;
            String n1,n2,res;
            switch (ch)
            {
                // Finding Square Root of a number
                case 1:
                    System.out.print(TEXT_BLUE+"Enter the number : "+TEXT_YELLOW);
                    n1 = inputDouble(sc);
                    if(n1.equals("no"))
                    {
                        System.out.println(TEXT_RED + "Try Again...");
                        break;
                    }

                    num1 = Double.parseDouble(n1);
                    result = squareRoot(num1);

                    if(result == -1)
                    {
                        System.out.println(TEXT_RED + "Input Invalid");
                        break;
                    }
                    System.out.println(TEXT_GREEN+"\n\nResult : " + result +"\n***********************************");
                    break;
                case 2:
                    System.out.print(TEXT_BLUE+"Enter the number : "+TEXT_YELLOW);
                    n1 = inputDouble(sc);
                    if(n1.equals("no"))
                    {
                        System.out.println(TEXT_RED + "Try Again...");
                        break;
                    }

                    num1 = Double.parseDouble(n1);
                    result = factorial(num1);

                    if(result == -1)
                    {
                        System.out.println(TEXT_RED + "Input Invalid");
                        break;
                    }

                    System.out.println(TEXT_GREEN+"\n\nResult : " + result +"\n***********************************");
                    break;
                case 3:
                    System.out.print(TEXT_BLUE+"Enter the number : "+TEXT_YELLOW);
                    n1 = inputDouble(sc);
                    if(n1.equals("no"))
                    {
                        System.out.println(TEXT_RED + "Try Again...");
                        break;
                    }

                    num1 = Double.parseDouble(n1);
                    res = natLog(num1);

                    if(res.equals("no"))
                    {
                        System.out.println(TEXT_RED + "Input Invalid");
                        break;
                    }

                    result = Double.parseDouble(res);
                    System.out.println(TEXT_GREEN+"\n\nResult : " + result +"\n***********************************");
                    break;
                case 4:
                    System.out.print(TEXT_BLUE+"Enter the number : "+TEXT_YELLOW);
                    n1 = inputDouble(sc);
                    if(n1.equals("no"))
                    {
                        System.out.println(TEXT_RED + "Try Again...");
                        break;
                    }

                    num1 = Double.parseDouble(n1);
                    res = natLog(num1);

                    if(res.equals("no"))
                    {
                        System.out.println(TEXT_RED + "Input Invalid");
                        break;
                    }

                    result = Double.parseDouble(res);
                    System.out.println(TEXT_GREEN+"\n\nResult : " + result +"\n***********************************");
                    break;
                default:
                    System.out.println(TEXT_RED+"\n\nExiting The Scientific Calculator with DevOps");
                    return;

            }
        }while (true);

    }


}