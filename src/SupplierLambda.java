import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;



public abstract class SupplierLambda {
    public static void main(String[] args) {

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 5;
            }
        };

        Supplier<Integer> supplier1 = () -> 5;

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        BinaryOperator<Integer> binaryOperator1 = (x, y) -> x + y;

        UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 1;
            }
        };

        UnaryOperator<Integer> unaryOperator1 = (x) -> x + 1;


        // лямбда - вычисления
        // для каждого элемента добавить 5
        // умножить на 2
        //поделить на 4
        // оставить те, которые больше 10

        UnaryOperator<Integer> integerUnaryOperator = (x) -> x + 5;
        UnaryOperator<Integer> integerUnaryOperator1 = (x) -> x * 2;
        UnaryOperator<Integer> integerUnaryOperator2 = (x) -> x / 2;
        Predicate<Integer> predicate = (x) -> x > 10;

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(45);
        list.add(23);
        list.add(94);
        list.add(10);
        list.add(30);

        List<Integer> answer = list.stream()
                .map((x) -> x + 5)
                .map((x) -> x * 2)
                .map((x) -> x / 4)
                .filter((x) -> x > 10)
                .toList();
        System.out.println(answer);





    }
}


