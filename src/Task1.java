import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторная работа №1. Задание №1");
        System.out.println("Вариант 2. Пункты 6-10");

        while (true) {

            System.out.println();
            System.out.println("6 - Большая буква");
            System.out.println("7 - Диапазон");
            System.out.println("8 - Делитель");
            System.out.println("9 - Равенство");
            System.out.println("10 - Многократный вызов");
            System.out.println("0 - Выход");
            System.out.print("Выберите задание: ");

            String choice = scanner.nextLine().trim();

            if (choice.equals("0")) {
                System.out.println("Программа завершена.");
                break;
            }

            switch (choice) {

                case "6":
                    System.out.print("Введите одну букву: ");
                    String letter = scanner.nextLine();

                    if (letter.length() == 1) {
                        System.out.println(isUpperCase(letter.charAt(0)));
                    } else {
                        System.out.println("Нужно ввести только один символ.");
                    }
                    break;

                case "7":
                    System.out.print("Введите две границы, после них - число: ");
                    String[] data7 = scanner.nextLine().trim().split("\\s+");

                    if (data7.length != 3) {
                        System.out.println("Нужно ввести три числа.");
                        break;
                    }

                    try {
                        int first = Integer.parseInt(data7[0]);
                        int second = Integer.parseInt(data7[1]);
                        int number = Integer.parseInt(data7[2]);

                        System.out.println(isInRange(first, second, number));

                    } catch (NumberFormatException ex) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "8":
                    System.out.print("Введите два числа: ");
                    String[] data8 = scanner.nextLine().trim().split("\\s+");

                    if (data8.length != 2) {
                        System.out.println("Нужно ввести два числа.");
                        break;
                    }

                    try {
                        int number1 = Integer.parseInt(data8[0]);
                        int number2 = Integer.parseInt(data8[1]);

                        System.out.println(isDivisor(number1, number2));

                    } catch (NumberFormatException ex) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "9":
                    System.out.print("Введите три числа: ");
                    String[] data9 = scanner.nextLine().trim().split("\\s+");

                    if (data9.length != 3) {
                        System.out.println("Нужно ввести три числа.");
                        break;
                    }

                    try {
                        int number1 = Integer.parseInt(data9[0]);
                        int number2 = Integer.parseInt(data9[1]);
                        int number3 = Integer.parseInt(data9[2]);

                        System.out.println(isEqual(number1, number2, number3));

                    } catch (NumberFormatException ex) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "10":
                    System.out.print("Введите пять чисел: ");
                    String[] data10 = scanner.nextLine().trim().split("\\s+");

                    if (data10.length != 5) {
                        System.out.println("Нужно ввести пять чисел.");
                        break;
                    }

                    try {
                        int a = Integer.parseInt(data10[0]);
                        int b = Integer.parseInt(data10[1]);
                        int c = Integer.parseInt(data10[2]);
                        int d = Integer.parseInt(data10[3]);
                        int e = Integer.parseInt(data10[4]);

                        int answer = lastNumSum(a, b);
                        answer = lastNumSum(answer, c);
                        answer = lastNumSum(answer, d);
                        answer = lastNumSum(answer, e);

                        System.out.println("Результат: " + answer);

                    } catch (NumberFormatException ex) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                default:
                    System.out.println("Такого задания нет! Введите 6/7/8/9/10/0!");
            }
        }

        scanner.close();
    }



    public static boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }


    public static boolean isInRange(int a, int b, int num) {
        if (a <= b) {
            return num >= a && num <= b;
        } else {
            return num >= b && num <= a;
        }
    }


    public static boolean isDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return false;
        }

        return a % b == 0 || b % a == 0;
    }


    public static boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }


    public static int lastNumSum(int a, int b) {
        int lastA = Math.abs(a % 10);
        int lastB = Math.abs(b % 10);

        return lastA + lastB;
    }
}




