public class Main {
    public static void main(String[] args) {

        int bananas = 5;
        int milk = 200;
        int iceCream = 2;
        int chickenEggs = 4;

        int bananasGrams = 5 * 80;
        int milkGrams = 210;
        int iceCreamGrams = 2 * 100;
        int chickenEggsGrams = 4 * 70;
        float totalGrams = bananasGrams + milkGrams + iceCreamGrams + chickenEggsGrams;
        float totalKilograms = totalGrams / 1000;

        System.out.println("Вес завтрака составит: " + totalGrams + " гр.");
        System.out.println("Вес завтрака составит: " + totalKilograms + " кг.");



    }
}