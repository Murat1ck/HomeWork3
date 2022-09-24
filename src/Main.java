public class Main {
    public static void main(String[] args) {

        int totalPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int oneClass = whitePaint + brownPaint;
        int totalClasses = totalPaint / oneClass;
        int totalWhite = totalClasses * whitePaint;
        int totalBrown = totalClasses * brownPaint;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");




    }
}