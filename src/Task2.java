import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Лабораторная работа №1. Задание №2");
        System.out.println("Вариант 2. Пункты 6-10");



        while (true) {

            System.out.println();
            System.out.println("6 - Тройная сумма");
            System.out.println("7 - Двойная сумма");
            System.out.println("8 - Возраст");
            System.out.println("9 - День недели");
            System.out.println("10 - Вывод дней недели");
            System.out.println("0 - Выход");
            System.out.print("Выберите задание: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "0":
                    System.out.println("Программа завершена.");
                    break;

                case "6":
                    System.out.print("Введите три целых числа через пробел: ");

                    String[] values6 = scanner.nextLine().trim().split("\\s+");

                    if (values6.length != 3) {
                        System.out.println("Необходимо ввести ТРИ числа.");
                        break;
                    }

                    try {
                        int first = Integer.parseInt(values6[0]);
                        int second = Integer.parseInt(values6[1]);
                        int third = Integer.parseInt(values6[2]);

                        System.out.println("Результат: " +
                                sum3(first, second, third));
                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "7":
                    System.out.print("Введите два целых числа через пробел: ");

                    String[] values7 = scanner.nextLine().trim().split("\\s+");

                    if (values7.length != 2) {
                        System.out.println("Необходимо ввести ДВА числа.");
                        break;
                    }

                    try {
                        int first = Integer.parseInt(values7[0]);
                        int second = Integer.parseInt(values7[1]);

                        System.out.println("Результат: " +
                                sum2(first, second));
                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "8":
                    System.out.print("Введите возраст: ");

                    try {
                        int ageValue = Integer.parseInt(scanner.nextLine().trim());

                        System.out.println("Результат: " + age(ageValue));
                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "9":
                    System.out.print("Введите номер дня от 1 до 7: ");

                    try {
                        int dayNumber = Integer.parseInt(scanner.nextLine().trim());

                        System.out.println("Результат: " + day(dayNumber));
                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "10":
                    System.out.print("Введите название дня недели: ");

                    String dayName = scanner.nextLine().trim().toLowerCase();
                    printDays(dayName);
                    break;

                default:
                    System.out.println("Такого задания нет! Введите 6/7/8/9/10/0!");
            }
        }

    }


    public static boolean sum3(int x, int y, int z) {
        return x + y == z || x + z == y || y + z == x;
    }


    public static int sum2(int x, int y) {
        int sum = x + y;

        if (sum >= 10 && sum <= 19) {
            return 20;
        }

        return sum;
    }


    public static String age(int x) {
        int lastDigit = x % 10;

        if (lastDigit == 1 && x != 11) {
            return x + " год";
        }

        if ((lastDigit == 2 || lastDigit == 3 || lastDigit == 4)
                && x != 12 && x != 13 && x != 14) {
            return x + " года";
        }

        return x + " лет";
    }



    public static String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }


    public static void printDays(String x) {
        switch (x) {
            case "понедельник":
                System.out.println("понедельник");
            case "вторник":
                System.out.println("вторник");
            case "среда":
                System.out.println("среда");
            case "четверг":
                System.out.println("четверг");
            case "пятница":
                System.out.println("пятница");
            case "суббота":
                System.out.println("суббота");
            case "воскресенье":
                System.out.println("воскресенье");
                break;
            default:
                System.out.println("это не день недели");
        }
    }
}