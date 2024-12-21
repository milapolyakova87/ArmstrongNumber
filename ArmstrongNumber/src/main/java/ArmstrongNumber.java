import java.util.Scanner;

public class ArmstrongNumber {

    // Метод для проверки, является ли число числом Армстронга
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number; // Сохраняем исходное число
        int numberOfDigits = String.valueOf(number).length(); // Количество цифр в числе
        int sum = 0; // Сумма цифр, возведённых в степень

        // Вычисляем сумму цифр, возведённых в степень
        while (number > 0) {
            int digit = number % 10; // Получаем последнюю цифру
            sum += (int) Math.pow(digit, numberOfDigits); // Явное приведение double к int
            number /= 10; // Убираем последнюю цифру
        }

        // Сравниваем сумму с исходным числом
        return sum == originalNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число для проверки: ");
        int number = scanner.nextInt();

        if (isArmstrongNumber(number)) {
            System.out.println(number + " является числом Армстронга.");
        } else {
            System.out.println(number + " не является числом Армстронга.");
        }
    }
}