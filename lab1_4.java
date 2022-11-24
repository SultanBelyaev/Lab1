import java.util.Scanner;
class MyProg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во точек : ");
        int n = sc.nextInt();
        System.out.println("Введите радиус : ");
        double r = sc.nextDouble();
        int number = 0;
        while (n > 0) {
            System.out.println("Введите x : ");
            double x = sc.nextDouble();
            System.out.println("Введите y : ");
            double y = sc.nextDouble();
            if (Math.sqrt(Math.abs(x)) + Math.sqrt(Math.abs(y)) <= Math.sqrt(r)) {
                number += 1;
            } else {
                number = number;
            }n--;
        }System.out.println(number);
    }
}