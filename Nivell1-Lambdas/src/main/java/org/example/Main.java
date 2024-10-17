package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercici 1");
        listWithO(List.of(new String[] {"hello", "ivan", "vilaro"})).forEach(System.out::println);

        System.out.println("\nExercici 2");
        listWithOAndGreaterThan5(List.of(new String[] {"hello", "ivan", "vilaro"})).forEach(System.out::println);

        System.out.println("\nExercici 3");
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        List.of(months).forEach(x -> System.out.println(x));

        System.out.println("\nExercici 4");
        List.of(months).forEach(System.out::println);

        System.out.println("\nExercici 5");
        MyFunctionalInterface myFunctionalInterface = () -> 3.1415;
        double piValue = myFunctionalInterface.getPiValue();
        System.out.println("pivalue = "+piValue);

        System.out.println("\nExercici 6");
        List<String> sortedMonths = new ArrayList<String>(List.of(months));
        sortedMonths.sort(Comparator.comparingInt(String::length));
        sortedMonths.forEach(System.out::println);

        System.out.println("\nExercici 7");
        List<String> reversedSortedMonths = new ArrayList<String>(List.of(months));
        reversedSortedMonths.sort(Comparator.comparingInt(String::length).reversed());
        reversedSortedMonths.forEach(System.out::println);

        System.out.println("\nExercici 8");
        ReverseInterface reverseInterface = s -> {
            StringBuilder builder = new StringBuilder();
            builder.append(s);
            builder.reverse();
            return builder.toString();
        };
        System.out.println(reverseInterface.reverse("HELLO"));
    }

    private static List<String> listWithO(List<String> list) {
        return list.stream().filter(x -> x.contains("o")).toList();
    }

    private static List<String> listWithOAndGreaterThan5(List<String> list) {
        return list.stream()
                .filter(x -> x.contains("o") && x.length() > 5)
                .toList();
    }
}