import java.util.Scanner;
class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите день : ");
        int a = sc.nextInt();
        System.out.println("Введите месяц : ");
        int n = sc.nextInt();
        if (n == 1 && a <= 31) {
            System.out.println("Зима");
        }
        else if (n == 2 && a <= 28) {
            System.out.println("Зима");
        }
        else if (n == 12 && a <= 31) {
            System.out.println("Зима");
        }
        else if (n == 3 && a <= 31) {
            System.out.println("Весна");
        }
        else if (n == 4 && a <= 30) {
            System.out.println("Весна");
        }
        else if (n == 5 && a <= 31) {
            System.out.println("Весна");
        }
        else if (n == 6 && a <= 30) {
            System.out.println("Лето");
        }
        else if (n == 7 && a <= 31) {
            System.out.println("Лето");
        }
        else if (n == 8 && a <= 31) {
            System.out.println("Лето");
        }
        else if (n == 9 && a <= 30) {
            System.out.println("Осень");
        }
        else if (n == 10 && a <= 31) {
            System.out.println("Осень");
        }
        else if (n == 11 && a <= 30) {
            System.out.println("Осень");
        }
        else {
            System.out.println("error");
        }
    }
}