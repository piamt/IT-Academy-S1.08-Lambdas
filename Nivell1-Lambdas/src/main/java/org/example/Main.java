package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Exercici 1");
        listWithO(List.of(new String[] {"hello", "ivan", "vilaro", "Open"})).forEach(System.out::println);

        System.out.println("\nExercici 2");
        listWithOAndGreaterThan5(List.of(new String[] {"hello", "ivan", "vilaro"})).forEach(System.out::println);

        System.out.println("\nExercici 3");
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        List.of(months).forEach(x -> System.out.println(x));

        System.out.println("\nExercici 4");
        List.of(months).forEach(System.out::println);

        System.out.println("\nExercici 5");
        PiValueInterface myFunctionalInterface = () -> 3.1415;
        double piValue = myFunctionalInterface.getPiValue();
        System.out.println("pivalue = "+piValue);

        System.out.println("\nExercici 6");
        List<Object> sortedList = new ArrayList<>(6);
        sortedList.add("January");
        sortedList.add("February");
        sortedList.add("March");
        sortedList.add("September");
        sortedList.add(34);
        sortedList.add(12535346);
        sortedList.sort(Comparator.comparingInt(x -> x.toString().length()));
        sortedList.forEach(System.out::println);

        System.out.println("\nExercici 7");
        List<Object> reversedSortedList = new ArrayList<>(sortedList);
        reversedSortedList.sort(Comparator.comparingInt(x -> x.toString().length()).reversed());
        reversedSortedList.forEach(System.out::println);

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
        return list.stream().filter(x -> x.contains("o") || x.contains("O")).toList();
    }

    private static List<String> listWithOAndGreaterThan5(List<String> list) {
        return list.stream()
                .filter(x -> (x.contains("o") || x.contains("O")) && x.length() > 5)
                .toList();
    }
}