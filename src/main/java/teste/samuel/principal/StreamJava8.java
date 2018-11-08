package teste.samuel.principal;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamJava8 {

    public static void main(String[] args) {
	String[][] data = new String[][] {{"a", "b"}, {"c", "d"}, {"e", "f"}};

	//Stream<String[]>
	Stream<String[]> temp = Arrays.stream(data);

	//System.out.println(temp.collect(Collectors.toList()));
        Stream<String> stringStream = temp.flatMap(x -> Arrays.stream(x));

        stringStream.forEach(System.out::println);
    }

}
