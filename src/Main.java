import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите положительное число:");
        int number = scanner.nextInt();
        try {
            checkedNumber(number);
            System.out.println("Ваше число " + number + " прошло проверку");
        } catch (NegativeNumberException nne) {
            System.out.println(nne.getMessage());
        }
    }
    private static void checkedNumber (int num) throws NegativeNumberException {
        // метод который принимает проверяет число на положительность.
        if (num<0) {
            throw new NegativeNumberException("Вы ввели отрицательное число "); //Выбрасываем ошибку
        }
    }

    }
