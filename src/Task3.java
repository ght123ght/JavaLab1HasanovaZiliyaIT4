
import java.util.Random;
import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {
        System.out.println("Лабораторная работа №1. Задание №3");
        System.out.println("Вариант 2. Пункты 6-10");

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("6 - Одинаковость");
            System.out.println("7 - Квадрат");
            System.out.println("8 - Левый треугольник");
            System.out.println("9 - Правый треугольник");
            System.out.println("10 - Угадайка");
            System.out.println("0 - Выход");
            System.out.print("Выберите задание: ");

            String choice = scanner.nextLine();

            if (choice.equals("0")) {
                System.out.println("Программа завершена.");
                break;
            }

            switch (choice) {
                case "6":
                    System.out.print("Введите число: ");

                    try {
                        int number = Integer.parseInt(scanner.nextLine().trim());
                        System.out.println(equalNum(number));
                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "7":
                    System.out.print("Введите размер квадрата: ");

                    try {
                        int size = Integer.parseInt(scanner.nextLine().trim());
                        square(size);
                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "8":
                    System.out.print("Введите высоту: ");

                    try {
                        int height = Integer.parseInt(scanner.nextLine().trim());
                        leftTriangle(height);
                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "9":
                    System.out.print("Введите высоту: ");

                    try {
                        int height = Integer.parseInt(scanner.nextLine().trim());
                        rightTriangle(height);
                    } catch (NumberFormatException e) {
                        System.out.println("ОШИБКА: нужно вводить целые числа!");
                    }
                    break;

                case "10":
                    guessGame(scanner);
                    break;

                default:
                    System.out.println("Такого задания нет! Введите 6/7/8/9/10/0!");
            }
        }

        scanner.close();
    }


    public static boolean equalNum(int number) {
        number = Math.abs(number);

        int lastDigit = number % 10;  //Считаем образцом и сравниваем со всеми остальными цифрами
        number = number / 10;  //Удаляем последнюю цифру

        while (number > 0) {  //Пока в числе остаются цифры, повторяем
            if (number % 10 != lastDigit) {
                return false;
            }

            number = number / 10;
        }

        return true;
    }


    public static void square(int size) {
        if (size < 0) {
            System.out.println("Размер не может быть отрицательным!");
            return;
        }
        //Идея:
        // Строки: начало (нач значение - 0), роу = 1, роу = 2, роу = 3
        //Звездочки: в первую строку - 3 звезды: ***, потом во вторую и третью
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void leftTriangle(int height) {
        if (height < 0) {
            System.out.println("Высота не может быть отрицательной!");
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
            System.out.println("Высота не может быть отрицательной!");
            return;
        }

        for (int row = 1; row <= height; row++) {  //Строки

            for (int space = 0; space < height - row; space++) {  //Пробелы, height - row: сколько пробелов надо
                System.out.print(" ");
            }

            for (int star = 0; star < row; star++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }


    public static void guessGame(Scanner scanner) {
        Random random = new Random();
        int secretNumber = random.nextInt(10);  //Случайное целое число от 0 до 9 вкл
        int attempts = 0; //Счетчик попыток

        while (true) {
            System.out.print("Введите число от 0 до 9: ");

            try {
                int userNumber = Integer.parseInt(scanner.nextLine().trim());
                attempts++;

                if (userNumber < 0 || userNumber > 9) {
                    System.out.println("Число должно быть от 0 до 9!");
                    continue;
                }

                if (userNumber == secretNumber) {
                    System.out.println("Вы угадали!");
                    System.out.println("Количество попыток: " + attempts);
                    break;
                }

                System.out.println("Не угадали. Попробуйте ещё раз.");

            } catch (NumberFormatException e) {
                System.out.println("ОШИБКА: нужно ввести целое число от 0 до 9!");
            }
        }
    }
}

