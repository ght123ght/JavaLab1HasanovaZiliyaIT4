import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Лабораторная работа №1");
        System.out.println("Хасанова Зилия, ИТ-4");
        System.out.println("Вариант 2");

        while (true) {

            System.out.println();
            System.out.println("Задание 1:");
            System.out.println("1 - 6 задача");
            System.out.println("2 - 7 задача");
            System.out.println("3 - 8 задача");
            System.out.println("4 - 9 задача");
            System.out.println("5 - 10 задача");

            System.out.println();
            System.out.println("Задание 2:");
            System.out.println("6 - 6 задача");
            System.out.println("7 - 7 задача");
            System.out.println("8 - 8 задача");
            System.out.println("9 - 9 задача");
            System.out.println("10 - 10 задача");

            System.out.println();
            System.out.println("Задание 3:");
            System.out.println("11 - 6 задача");
            System.out.println("12 - 7 задача");
            System.out.println("13 - 8 задача");
            System.out.println("14 - 9 задача");
            System.out.println("15 - 10 задача");

            System.out.println();
            System.out.println("Задание 4:");
            System.out.println("16 - 6 задача");
            System.out.println("17 - 7 задача");
            System.out.println("18 - 8 задача");
            System.out.println("19 - 9 задача");
            System.out.println("20 - 10 задача");

            System.out.println();
            System.out.println("0 - выход");

            System.out.print("Выберите задание: ");
            String choice = scanner.nextLine().trim();

            switch (choice) {

                // ЗАДАНИЕ 1

                case "1":
                    System.out.print("Введите одну букву: ");
                    String letter = scanner.nextLine();

                    if (letter.length() == 1) {
                        System.out.println("Результат: "
                                + isUpperCase(letter.charAt(0)));
                    } else {
                        System.out.println("Нужно ввести только один символ.");
                    }
                    break;

                case "2":
                    System.out.print("Введите левую границу, правую границу и число: ");

                    try {
                        int a = Integer.parseInt(scanner.next());
                        int b = Integer.parseInt(scanner.next());
                        int num = Integer.parseInt(scanner.next());
                        scanner.nextLine();

                        System.out.println("Результат: "
                                + isInRange(a, b, num));

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                        scanner.nextLine();
                    }
                    break;

                case "3":
                    System.out.print("Введите два числа: ");

                    try {
                        int a = Integer.parseInt(scanner.next());
                        int b = Integer.parseInt(scanner.next());
                        scanner.nextLine();

                        System.out.println("Результат: "
                                + isDivisor(a, b));

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                        scanner.nextLine();
                    }
                    break;

                case "4":
                    System.out.print("Введите три числа: ");

                    try {
                        int a = Integer.parseInt(scanner.next());
                        int b = Integer.parseInt(scanner.next());
                        int c = Integer.parseInt(scanner.next());
                        scanner.nextLine();

                        System.out.println("Результат: "
                                + isEqual(a, b, c));

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                        scanner.nextLine();
                    }
                    break;

                case "5":
                    System.out.print("Введите пять чисел: ");

                    try {
                        int a = Integer.parseInt(scanner.next());
                        int b = Integer.parseInt(scanner.next());
                        int c = Integer.parseInt(scanner.next());
                        int d = Integer.parseInt(scanner.next());
                        int e = Integer.parseInt(scanner.next());
                        scanner.nextLine();

                        int answer = lastNumSum(a, b);
                        answer = lastNumSum(answer, c);
                        answer = lastNumSum(answer, d);
                        answer = lastNumSum(answer, e);

                        System.out.println("Результат: " + answer);

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                        scanner.nextLine();
                    }
                    break;



                // ЗАДАНИЕ 2

                case "6":
                    System.out.print("Введите три числа: ");

                    try {
                        int x = Integer.parseInt(scanner.next());
                        int y = Integer.parseInt(scanner.next());
                        int z = Integer.parseInt(scanner.next());
                        scanner.nextLine();

                        System.out.println("Результат: "
                                + sum3(x, y, z));

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                        scanner.nextLine();
                    }
                    break;

                case "7":
                    System.out.print("Введите два числа: ");

                    try {
                        int x = Integer.parseInt(scanner.next());
                        int y = Integer.parseInt(scanner.next());
                        scanner.nextLine();

                        System.out.println("Результат: "
                                + sum2(x, y));

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                        scanner.nextLine();
                    }
                    break;

                case "8":
                    System.out.print("Введите возраст: ");

                    try {
                        int x = Integer.parseInt(scanner.nextLine().trim());

                        System.out.println("Результат: "
                                + age(x));

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целое число!");
                    }
                    break;

                case "9":
                    System.out.print("Введите номер дня от 1 до 7: ");

                    try {
                        int x = Integer.parseInt(scanner.nextLine().trim());

                        System.out.println("Результат: "
                                + day(x));

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целое число!");
                    }
                    break;

                case "10":
                    System.out.print("Введите название дня недели: ");
                    String dayName = scanner.nextLine().trim().toLowerCase();

                    printDays(dayName);
                    break;


                // ЗАДАНИЕ 3

                case "11":
                    System.out.print("Введите число: ");

                    try {
                        int x = Integer.parseInt(scanner.nextLine().trim());

                        System.out.println("Результат: "
                                + equalNum(x));

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целое число!");
                    }
                    break;

                case "12":
                    System.out.print("Введите размер квадрата: ");

                    try {
                        int x = Integer.parseInt(scanner.nextLine().trim());

                        square(x);

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целое число!");
                    }
                    break;

                case "13":
                    System.out.print("Введите высоту треугольника: ");

                    try {
                        int x = Integer.parseInt(scanner.nextLine().trim());

                        leftTriangle(x);

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целое число!");
                    }
                    break;

                case "14":
                    System.out.print("Введите высоту треугольника: ");

                    try {
                        int x = Integer.parseInt(scanner.nextLine().trim());

                        rightTriangle(x);

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целое число!");
                    }
                    break;

                case "15":
                    guessGame();
                    break;


                // ЗАДАНИЕ 4

                case "16":
                    int[] array = readArray();

                    if (array != null) {
                        reverse(array);

                        System.out.println("Результат: "
                                + Arrays.toString(array));
                    }
                    break;

                case "17":
                    int[] source = readArray();

                    if (source != null) {
                        int[] result = reverseBack(source);

                        System.out.println("Результат: "
                                + Arrays.toString(result));
                    }
                    break;

                case "18":
                    System.out.println("Первый массив:");
                    int[] first = readArray();

                    System.out.println("Второй массив:");
                    int[] second = readArray();

                    if (first != null && second != null) {
                        int[] result = concat(first, second);

                        System.out.println("Результат: "
                                + Arrays.toString(result));
                    }
                    break;

                case "19":
                    System.out.print("Введите x: ");

                    try {
                        int x = Integer.parseInt(scanner.nextLine().trim());

                        int[] numbers = readArray();

                        if (numbers != null) {
                            int[] indexes = findAll(numbers, x);

                            System.out.println("Результат: "
                                    + Arrays.toString(indexes));
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целое число!");
                    }
                    break;

                case "20":
                    int[] numbers = readArray();

                    if (numbers != null) {
                        int[] result = deleteNegative(numbers);

                        System.out.println("Результат: "
                                + Arrays.toString(result));
                    }
                    break;

                case "0":
                    System.out.println("Программа завершена.");
                    scanner.close();
                    return;

                default:
                    System.out.println(
                            "Такого задания нет! Введите число от 0 до 20."
                    );
            }
        }
    }


    // ЗАДАНИЕ 1

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


    // ЗАДАНИЕ 2

    public static boolean sum3(int x, int y, int z) {
        return x + y == z
                || x + z == y
                || y + z == x;
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

        if ((lastDigit == 2
                || lastDigit == 3
                || lastDigit == 4)
                && x != 12
                && x != 13
                && x != 14) {

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


    // ЗАДАНИЕ 3

    public static boolean equalNum(int number) {

        number = Math.abs(number);

        int lastDigit = number % 10;

        number = number / 10;

        while (number > 0) {

            if (number % 10 != lastDigit) {
                return false;
            }

            number = number / 10;
        }

        return true;
    }


    public static void square(int size) {

        if (size < 0) {
            System.out.println(
                    "Размер не может быть отрицательным!"
            );
            return;
        }

        for (int row = 0; row < size; row++) {

            for (int column = 0; column < size; column++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void leftTriangle(int height) {

        if (height < 0) {
            System.out.println(
                    "Высота не может быть отрицательной!"
            );
            return;
        }

        for (int row = 1; row <= height; row++) {

            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void rightTriangle(int height) {

        if (height < 0) {
            System.out.println(
                    "Высота не может быть отрицательной!"
            );
            return;
        }

        for (int row = 1; row <= height; row++) {

            for (int space = 0; space < height - row; space++) {
                System.out.print(" ");
            }

            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void guessGame() {

        Random random = new Random();

        int secretNumber = random.nextInt(10);

        int attempts = 0;

        while (true) {

            System.out.print("Введите число от 0 до 9: ");

            try {

                int userNumber =
                        Integer.parseInt(scanner.nextLine().trim());

                if (userNumber < 0 || userNumber > 9) {
                    System.out.println(
                            "Число должно быть от 0 до 9!"
                    );
                    continue;
                }

                attempts++;

                if (userNumber == secretNumber) {

                    System.out.println("Вы угадали!");

                    System.out.println(
                            "Количество попыток: " + attempts
                    );

                    break;
                }

                System.out.println(
                        "Не угадали. Попробуйте ещё раз."
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "ОШИБКА: нужно ввести целое число от 0 до 9!"
                );
            }
        }
    }



    // ЗАДАНИЕ 4

    public static int[] readArray() {

        System.out.print("Введите массив: ");

        String input = scanner.nextLine().trim();

        if (input.isEmpty()) {

            System.out.println("Массив не введён!");

            return null;
        }

        String[] parts = input.split("\\s+");

        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {

            try {

                numbers[i] =
                        Integer.parseInt(parts[i]);

            } catch (NumberFormatException e) {

                System.out.println(
                        "ОШИБКА: '" + parts[i]
                                + "' — не целое число!"
                );

                return null;
            }
        }

        return numbers;
    }


    public static void reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i];

            arr[i] =
                    arr[arr.length - 1 - i];

            arr[arr.length - 1 - i] =
                    temp;
        }
    }


    public static int[] reverseBack(int[] arr) {

        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            result[i] =
                    arr[arr.length - 1 - i];
        }

        return result;
    }


    public static int[] concat(
            int[] first,
            int[] second) {

        int[] result =
                new int[first.length + second.length];

        for (int i = 0; i < first.length; i++) {

            result[i] = first[i];
        }

        for (int i = 0; i < second.length; i++) {

            result[first.length + i] =
                    second[i];
        }

        return result;
    }


    public static int[] findAll(
            int[] arr,
            int x) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {
                count++;
            }
        }

        int[] indexes = new int[count];

        int position = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == x) {

                indexes[position] = i;

                position++;
            }
        }

        return indexes;
    }


    public static int[] deleteNegative(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {
                count++;
            }
        }

        int[] result = new int[count];

        int position = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] >= 0) {

                result[position] = arr[i];

                position++;
            }
        }

        return result;
    }
}