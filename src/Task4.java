
import java.util.Arrays;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        System.out.println("Лабораторная работа №1. Задание №4");
        System.out.println("Вариант 2. Пункты 6-10");

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("6 - Реверс массива");
            System.out.println("7 - Реверсивная версия: новый массив");
            System.out.println("8 - Объединение массивов");
            System.out.println("9 - Индексы вхождения x");
            System.out.println("10 - Удаление отрицательных чисел");
            System.out.println("0 - Выход");
            System.out.print("Выберите задание: ");

            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("Программа завершена.");
                break;
            }

            switch (choice) {

                case "6":

                    int[] array = readArray(scanner);

                    if (array != null) {
                        reverse(array);
                        System.out.println("Результат: " + Arrays.toString(array));
                    }
                    break;

                case "7":

                    int[] source = readArray(scanner);

                    if (source != null) {
                        int[] result = reverseBack(source);
                        System.out.println("Результат: " + Arrays.toString(result));
                    }
                    break;

                case "8":

                    System.out.println("Первый массив:");
                    int[] first = readArray(scanner);

                    System.out.println("Второй массив:");
                    int[] second = readArray(scanner);

                    if (first != null && second != null) {
                        int[] result = concat(first, second);
                        System.out.println("Результат: " + Arrays.toString(result));
                    }
                    break;

                case "9":

                    System.out.print("Введите x: ");

                    try {
                        int x = Integer.parseInt(scanner.nextLine().trim());

                        int[] numbers = readArray(scanner);

                        if (numbers != null) {
                            int[] indexes = findAll(numbers, x);
                            System.out.println("Результат: " + Arrays.toString(indexes));
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "10":

                    int[] numbers = readArray(scanner);

                    if (numbers != null) {
                        int[] positive = deleteNegative(numbers);
                        System.out.println("Результат: " + Arrays.toString(positive));
                    }
                    break;

                default:
                    System.out.println("Такого задания нет! Введите 6/7/8/9/10/0!");
                    break;
            }
        }
    }

    // Ввод массива
    public static int[] readArray(Scanner scanner) {
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
                numbers[i] = Integer.parseInt(parts[i]);
            } catch (NumberFormatException e) {
                System.out.println("ОШИБКА: '" + parts[i] + "' — не целое число!");
                return null;
            }
        }

        return numbers;
    }




    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }


    public static int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }

        return result;
    }


    public static int[] concat(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];

        for (int i = 0; i < first.length; i++) {
            result[i] = first[i];
        }

        for (int i = 0; i < second.length; i++) {
            result[first.length + i] = second[i];
        }

        return result;
    }


    public static int[] findAll(int[] arr, int x) {
        int count = 0;

        // Сначала считаем количество вхождений
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        int[] indexes = new int[count];
        int position = 0;

        // Затем записываем индексы
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

        // Считаем количество неотриц чисел
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int position = 0;

        // Записываем только неотриц эчисла
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                result[position] = arr[i];
                position++;
            }
        }

        return result;
    }
}


