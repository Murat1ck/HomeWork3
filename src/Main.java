public class Main {
    public static void main(String[] args) {

        int a = 16/2; //производительность в минуту
        int b = a * 20; //20min
        int c = 60 * 24; //мин в сутках
        int d = a * c; //бутылок в сутки
        int e = (a * c) * 3; //за три дня
        int f = e * 30; //за месяц

        System.out.println("За 20 минут работы машины произвела бутылок: " + b + " штук ");
        System.out.println("За " + c + " минут работы машины произвела бутылок: " + d + " штук ");
        System.out.println("За три дня работы машины произвела бутылок: " + e + " штук ");
        System.out.println("За месяц работы машины произвела бутылок: " + f + " штук ");




    }
}