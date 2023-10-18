public class MainFourth {
    public static void main(String[] args) {
        TripleOperator tripleOperator = (x, y, z) -> x + y + z;

        System.out.println(tripleOperator.calculate(3,4,5));

        TripleOperator tripleOperator1 = (a, b, c) -> a + b + c;
    }
}
