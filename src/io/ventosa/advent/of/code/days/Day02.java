package io.ventosa.advent.of.code.days;

import io.ventosa.advent.of.code.Day;

import java.util.ArrayList;

public class Day02 extends Day {
    public Day02() {
        super("input02");
    }

    @Override
    protected void part1() {
        int vertical = 0;
        int horizontal = 0;

        for (String str: getInput()) {
            String[] thing = str.split(" ");
            switch(thing[0]){
                case "forward":
                    horizontal = horizontal + Integer.parseInt(thing[1]);
                    break;
                case "up":
                    vertical = vertical - Integer.parseInt(thing[1]);
                    break;
                case "down":
                    vertical = vertical + Integer.parseInt(thing[1]);
            }
        }

        System.out.println(vertical * horizontal);
    }

    @Override
    protected void part2() {
        int depth = 0;
        int horizontal = 0;
        int aim = 0;

        for (String str: getInput()) {
            String[] thing = str.split(" ");
            switch(thing[0]){
                case "forward":
                    horizontal = horizontal + Integer.parseInt(thing[1]);
                    depth = depth + (aim * Integer.parseInt(thing[1]));
                    break;
                case "up":
                    aim = aim - Integer.parseInt(thing[1]);
                    break;
                case "down":
                    aim = aim + Integer.parseInt(thing[1]);
            }
        }

        System.out.println(depth * horizontal);
    }
}
