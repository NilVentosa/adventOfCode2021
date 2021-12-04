package io.ventosa.advent.of.code;

import io.ventosa.advent.of.code.days.*;

public class App {

    public static void main(String[] args) {
        runArgs(args);
    }

    private static void runArgs(String[] args) {
        for (String arg: args) {
            switch (Integer.parseInt(arg)){
                case 1:
                    run(new Day01());
                    break;
                case 2:
                    run(new Day02());
                    break;
                default:
                    System.out.println("No day");
            }
        }
    }

    private static void run(Day day) {
        day.run();
    }
}
