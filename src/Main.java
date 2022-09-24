public class Main {
    public static void main(String[] args) {

        float salaryMasha = 67_760;
        float salaryDenis = 83_690;
        float salaryKristina = 76_230;

        double raisingSalaryMasha = 67_760 * 0.1; //сумма увеличения
        double raisingSalaryDenis = 83_690 * 0.1;
        double raisingSalaryKristina = 76_230 * 0.1;

        double increasedSalaryMasha  = salaryMasha + raisingSalaryMasha; //увеличенная зп
        double increasedSalaryDenis  = salaryDenis + raisingSalaryDenis;
        double increasedSalaryKristina  = salaryKristina + raisingSalaryKristina;
        int a = 12; //год
        float annualSalaryMasha = salaryMasha * a; //зп за год
        float annualSalaryDenis = salaryDenis * a;
        float annualSalaryKristina = salaryKristina * a;

        double annualIncreasedSalaryMasha  = increasedSalaryMasha * a;  //увеличенная зп за год
        double annualIncreasedSalaryDenis  = increasedSalaryDenis * a;
        double annualIncreasedSalaryKristina  = increasedSalaryKristina * a;

        double b = annualIncreasedSalaryMasha - annualSalaryMasha; // разница дохода за год
        double c = annualIncreasedSalaryDenis - annualSalaryDenis;
        double d = annualIncreasedSalaryKristina - annualSalaryKristina;

        System.out.println( "Маша теперь получает " + increasedSalaryMasha + " рублей. Годовой доход вырос на: " + b + " рублей");
        System.out.println( "Денис теперь получает " + increasedSalaryDenis + " рублей. Годовой доход вырос на: " + c + " рублей");
        System.out.println( "Кристина теперь получает " + increasedSalaryKristina + " рублей. Годовой доход вырос на: " + d + " рублей");

        System.out.println(increasedSalaryKristina);


    }
}