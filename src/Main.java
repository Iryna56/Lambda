import java.util.function.*;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String result = s + s;
                System.out.println(result);
            }
        };




        consumer.accept("Привет");
        consumer.accept("Как дела");

        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 1;
            }
        };

        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 10;
            }
        };

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 5;
            }
        };

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };

        UnaryOperator<Integer> unaryOperator = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer / 2;
            }
        };

        System.out.println(unaryOperator.apply(5));

        System.out.println(binaryOperator.apply(5, 6));

        System.out.println(supplier.get());

        System.out.println(predicate.test(20));


        System.out.println(function.apply(5));
    }
}