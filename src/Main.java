import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myFirstString;
        final int num = 1;
        String word = " ночь";
        myFirstString = num + word;
        System.out.println(myFirstString + " " + word + " " + num);

        if (num < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (num > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        System.out.print("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
       String name= scanner.nextLine();
        System.out.println("Здравствуйте "+ name);
    }
}