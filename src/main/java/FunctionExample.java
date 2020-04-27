import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {
    public static void runFunction() {
        Function<String, String> doubleFunc = (String name) -> name + " " + name;

        List<String> nameList = Arrays.asList("alpha", "beta", "charlie", "delta");

        nameList.forEach(name -> System.out.println(doubleFunc.apply(name)));
    }
}
