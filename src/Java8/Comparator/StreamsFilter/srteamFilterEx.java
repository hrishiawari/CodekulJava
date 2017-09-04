package Java8.Comparator.StreamsFilter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by melayer on 4/9/17.
 */
public class srteamFilterEx {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("One","two","Three","Four");
        List<String> result=l.stream()
                .filter(li -> !"One".equals(li))
                .collect(Collectors.toList());
        result.forEach(System.out::println);
         }
}
