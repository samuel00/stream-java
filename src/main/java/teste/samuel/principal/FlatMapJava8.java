package teste.samuel.principal;

import teste.samuel.modelo.Student;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FlatMapJava8 {

    public static void main(String[] args) {

	Student obj1 = new Student();
	obj1.setName("mkyong");
	obj1.addBook("Java 8 in Action");
	obj1.addBook("Spring Boot in Action");
	obj1.addBook("Effective Java (2nd Edition)");

	Student obj2 = new Student();
	obj2.setName("zilap");
	obj2.addBook("Learning Python, 5th Edition");
	obj2.addBook("Effective Java (2nd Edition)");

	List<Student> list = new ArrayList<>();
	list.add(obj1);
	list.add(obj2);


        Collection<String> livros = list.stream().map(l -> l.getBook())
		        .flatMap( b -> b.stream())
		        .collect(Collectors.toMap(b -> b.hashCode(),Function.identity(), (valorAtingo, valorNovo) -> valorAtingo)).values();

        Set<String> setString = new HashSet<>(livros);

        setString.forEach(System.out::println);
    }

}
