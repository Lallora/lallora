package lallora.point7_AnotherSolutions;

public class Main {
    public static void main(String[] args) {
        FICalculation add = (x, y) -> x + y;
        FICalculation subtract = (x, y) -> x - y;
        FICalculation multiply = (x, y) -> x * y;
        FICalculation division = (x, y) -> x / y;

        int z1 = add.calculation(8,4);
        System.out.println(z1);
        int z2 = subtract.calculation(8,4);
        System.out.println(z2);
        int z3 = multiply.calculation(8,4);
        System.out.println(z3);
        int z4 = division.calculation(8,4);
        System.out.println(z4);

    }
}
