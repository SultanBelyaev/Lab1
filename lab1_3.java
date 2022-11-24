import java.util.Scanner;
class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        int a = sc.nextInt();
        System.out.println("Введите степень : ");
        int n = sc.nextInt();
        int b = a;
        if (a > -15 & a < 15) {
            if (n > 0) {
                while (n != 1) {
                    b *= a;
                    n--;
                }
                System.out.println(b);
            }
            if (n < 0) {
                while (n != -1) {
                    b *= a;
                    n++;
                }
                float z = b;
                System.out.println(1/z);
            }
        }
    }
}