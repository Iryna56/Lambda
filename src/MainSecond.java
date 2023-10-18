import java.util.function.Function;
import java.util.function.Supplier;

public class MainSecond {
    public static void main(String[] args) {
        Function<Double, Double> function = (x) -> Math.floor(x);

        System.out.println(function.apply(5.9));  //5
        System.out.println(function.apply(4.2));  //4
        System.out.println(function.apply(3.8));  //3
        System.out.println(function.apply(-3.8));  // -4

        Function<Double, Double> secondFunction = (t) -> t + 0.5;

        System.out.println(secondFunction.apply(5.0));

        Function<Integer, Integer> thirdFunction = (x) -> {
            int result = 0;
            for (int i = 0; i <= x; i++) {
                result += i;
            }
            return result;
        };

        System.out.println(thirdFunction.apply(100));

        int a = 1;  //   по умолчанию переменная final

        Supplier<Integer> integerSupplier = () -> a;

//        a = 2; захват переменной  НЕЛЬЗЯ ИЗМЕНЯТЬ ТЕ ПЕРЕМЕННЫЕ, КОТОРЫЕ БЫЛИ СОЗДАНЫ ДО ЛЯМБДА-ВЫРАЖЕНИЙ, НО ИСПОЛЬЗОВАНЫ В ЛЯМБДА-ВЫРАЖЕНИЯХ
        // в ЛВ мы можем использовать только final  переменные
        System.out.println(integerSupplier);


    }
}
