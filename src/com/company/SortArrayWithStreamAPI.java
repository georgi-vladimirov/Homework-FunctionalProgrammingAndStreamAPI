package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by GOGO on 2.4.2016 г..
 */
public class SortArrayWithStreamAPI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] stingLine = input.nextLine().split(" ");
        String order = input.nextLine();

        Arrays.stream(stingLine).map(s->Integer.parseInt(s))
                .sorted((el1,el2)-> {
                    if (order.equals("Ascending")){
                        return el1.compareTo(el2);
                    }
                    return el2.compareTo(el1);
                })
                .forEach(p-> System.out.print(p+" "));
    }
}
