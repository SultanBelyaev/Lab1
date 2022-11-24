import java.util.Scanner;
class MyProg {
    public static void main(String[] args) {
        Scanner sy = new Scanner(System.in);
        System.out.println("Введите год рождения: ");
        int birthyear = sy.nextInt();
        Scanner sm = new Scanner(System.in);
        System.out.println("Введите месяц рождения: ");
        int birthmonth = sm.nextInt();
        Scanner sd = new Scanner(System.in);
        System.out.println("Введите день рождения: ");
        int birthday = sd.nextInt();
        int today = 25;
        int thismonth = 11;
        int thisyear = 2022;
        if ((birthyear == 2022 && birthmonth == 11 && birthday > 25) || (birthyear == 2022 && birthmonth > 11) || (birthyear > 2022)) {
            System.out.println(" error , Введите заново ");
        } else {
            int resyear = thisyear - birthyear;
            int resmonth = thismonth - birthmonth;
            int resday = today - birthday;
            if (birthmonth > thismonth) {
                resmonth = resmonth + 12;
                resyear--;
            }
            if (birthday > today) {
                resday = resday + 30; // при условии ,что в месяце 30 дней)
                resmonth--;
            }
            System.out.println(resyear + " лет " + resmonth + " месяцев " + resday + " дней.");
        }
    }
}