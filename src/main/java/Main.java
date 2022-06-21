public class Main {
    public static void main(String[] args) {
        int value1 = 1000000011;
        int value2 = 111000;
        int totalValue = addValue(value1, value2);
        char ch1 = 13;
        int ch2 = 1;
        int ch3 = 10;
        int ch4 = 22;
        int sheep = 10;
        int totalSheep = addSheep(sheep);


        System.out.println(totalValue);
        System.out.println(ch1 + ch2);
        System.out.println(ch1 + ch3);
        System.out.println(ch1 + ch4);
        System.out.println(ch1 - ch2);
        System.out.println(ch1 - ch3);
        System.out.println(ch1 - ch4);
        System.out.println("Результат равен " + totalSheep + " овец (штук");
    }

    public static int addValue(int value1, int value2) {
        int result = 0;

        result = value1 + value2;

        return result;


    }

    public static int addSheep(int sheep) {
        int result = 0;

        result = sheep + 1;

        return result;
    }
}