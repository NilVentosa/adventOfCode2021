package io.ventosa.advent.of.code.days;

import io.ventosa.advent.of.code.Day;

import java.util.ArrayList;

public class Day01 extends Day {
    public Day01() {
        super("input01");
    }

    @Override
    protected void part1() {
        System.out.println(howManyIncreases(getInput()));
    }

    @Override
    protected void part2() {
        System.out.println(howManyWindowIncreases(getInput()));
    }

    private int howManyIncreases(ArrayList<String> numbers) {
        Integer prev = null;
        int result = 0;

        for (String str: numbers) {
            if (prev != null) {
                if (prev < Integer.parseInt(str)) {
                    result++;
                }
            }
            prev = Integer.parseInt(str);
        }

        return result;
    }

    private int howManyWindowIncreases(ArrayList<String> numbers) {
        int result = 0;

        Integer prev = null;

        for (int i =2; i < numbers.size(); i++) {
            Integer current = Integer.parseInt(numbers.get(i)) + Integer.parseInt(numbers.get(i-1)) + Integer.parseInt(numbers.get(i-2));
            if (prev != null) {
                if (prev < current) {
                    result++;
                }
            }
            prev = current;
        }

        return result;
    }
}
