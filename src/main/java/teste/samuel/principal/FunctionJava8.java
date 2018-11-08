package teste.samuel.principal;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FunctionJava8 {

    public static void main(String[] args) {
	List<Integer> listaJava = Arrays.asList(1, 2, 3);
	List<String> names = Arrays.asList("Einsteins", "Newton", "Copernicus", "Kepler");
	// Arrays.stream(names).forEach(nome -> System.out.println(nome.length())); Quando for vetor

	names.stream().filter(nome -> nome.length() > 6).forEach(nome -> {
	    Function<String, Integer> function = FunctionJava8::getTamanhoString;
	    System.out.println(function.apply(nome));
	});

        System.out.println("\n################################################################");

        IntStream intStream = names.stream().mapToInt(String::length);
        System.out.println(intStream.filter( i -> !(i % 2 == 0)).max().getAsInt());

	System.out.println("\n################################################################");

	listaJava.forEach(numero -> System.out.println(numero + 1));
    }

    private static Integer getTamanhoString(String s) {
	return s.length();
    }
}
