package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class Calculator
{
    private Logger logger;
    public static final String TEXT_RED = "\u001B[31m";
    public static final String TEXT_BLACK = "\u001B[30m";
    public static final String TEXT_GREEN = "\u001B[32m";
    public static final String TEXT_BLUE = "\u001B[34m";
    public static final String TEXT_RESET = "\u001B[0m";
    public static final String TEXT_PURPLE = "\u001B[35m";
    public static final String TEXT_CYAN = "\u001B[36m";
    public static final String TEXT_YELLOW = "\u001B[33m";
    public static final String TEXT_WHITE = "\u001B[37m";



    Calculator()
    {
        logger  = LogManager.getLogger(Calculator.class);
    }



    public static void main(String[] args)
    {
//        https://www.itsupportwale.com/blog/print-awesome-ascii-text-in-linux-terminal/
//        https://www.w3schools.blog/java-console-and-terminal-color

        System.out.println(TEXT_RED+"____ ___  ____    _  _ _ _  _ _    ___  ____ ____  _ ____ ____ ___");
        System.out.println("[__  |__] |___    |\\/| | |\\ | |    |__] |__/ |  |  | |___ |     |");
        System.out.println("___] |    |___    |  | | | \\| |    |    |  \\ |__| _| |___ |___  |");


        System.out.println(TEXT_BLUE+"____ ____ _ ____ _  _ ___ _ ____ _ ____    ____ ____ _    ____ _  _ _    ____ ___ ____ ____    _ _ _ _ ___ _  _    ___  ____ _  _ ____ ___  ____");
        System.out.println("[__  |    | |___ |\\ |  |  | |___ | |       |    |__| |    |    |  | |    |__|  |  |  | |__/    | | | |  |  |__|    |  \\ |___ |  | |  | |__] [__");
        System.out.println("___] |___ | |___ | \\|  |  | |    | |___    |___ |  | |___ |___ |__| |___ |  |  |  |__| |  \\    |_|_| |  |  |  |    |__/ |___  \\/  |__| |    ___]");

        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        
    }
}