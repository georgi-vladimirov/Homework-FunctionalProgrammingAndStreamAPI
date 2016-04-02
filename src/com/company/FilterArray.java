package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class FilterArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stingLine = input.nextLine().split(" ");

        Arrays.stream(stingLine).filter(s -> s.length()>3).forEach(p -> System.out.print(p + " "));
    }
}
