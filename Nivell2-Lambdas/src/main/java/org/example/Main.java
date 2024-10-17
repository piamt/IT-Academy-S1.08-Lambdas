package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercici 1");
        String[] names = {"andrea", "Anton", "Ana", "aut"};
        namesLength3AndStartWithA(List.of(names)).forEach(System.out::println);

        System.out.println("\nExercici 2");
        String evenOrOddResult = getStringEvenOrOdd(List.of(new Integer[] {2, 33, 55, 42, 54}));
        System.out.println(evenOrOddResult);

        System.out.println("\nExercici 3");
        CalculatorInterface calculatorAdd = (num1, num2) -> num1 + num2;
        CalculatorInterface calculatorSubtract = (num1, num2) -> num1 - num2;
        CalculatorInterface calculatorMultiply = (num1, num2) -> num1 * num2;
        CalculatorInterface calculatorDivide = (num1, num2) -> num1 / num2;
        System.out.println(calculatorAdd.operation(2.0f, 3.5f));
        System.out.println(calculatorSubtract.operation(2.0f, 3.5f));
        System.out.println(calculatorMultiply.operation(2.0f, 3.5f));
        System.out.println(calculatorDivide.operation(2.0f, 3.5f));

        System.out.println("\nExercici 4");
        List<String> multiTypeList = new ArrayList<>();
        multiTypeList.add("2.0");
        multiTypeList.add("Hello world!");
        multiTypeList.add("Mango");
        multiTypeList.add("Eva María se fue");
        multiTypeList.add("45");

        System.out.println("Sorted alphabetically by 1st char");
        multiTypeList.stream()
                .sorted(Comparator.comparing(s -> s.charAt(0)))
                .forEach(System.out::println);

        System.out.println("\nSorted by containing 'e' first");
        multiTypeList.stream()
                .sorted(Comparator.comparing(s -> {
                    if (s.contains("e")) return 1;
                    else  return 2;
                }))
                .forEach(System.out::println);

        System.out.println("\nModify 'a' by '4'");
        multiTypeList.stream()
                .map(s -> s.replaceAll("a", "4"))
                .forEach(System.out::println);

        System.out.println("\nShow only numbers");

        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        multiTypeList.stream()
                .filter(x -> pattern.matcher(x).matches())
                .forEach(System.out::println);
    }

    private static List<String> namesLength3AndStartWithA(List<String> list) {
        return list.stream()
                .filter(x -> x.startsWith("A") && x.length() == 3)
                .toList();
    }

    private static String getStringEvenOrOdd(List<Integer> list) {
        EvenOrOddInterface isEvenInterface = (value) -> value % 2 == 0;

        return list.stream()
                .map(x -> (isEvenInterface.isEven(x) ? "e" : "o") + x)
                .collect(Collectors.joining(","));
    }
}