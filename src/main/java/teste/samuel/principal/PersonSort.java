package teste.samuel.principal;

import teste.samuel.modelo.Person;
import teste.samuel.teste.samuel.util.PersonSortByAge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonSort {

    public static void main(String[] args) {

	Person p1 = new Person();
	Person p2 = new Person();
	Person p3 = new Person();

	p1.setAge(20);
	p1.setName("abc");

	p2.setAge(25);
	p2.setName("xyz");

	p3.setAge(15);
	p3.setName("def");

	List<Person> people = new ArrayList<Person>();
	people.add(p1);
	people.add(p2);
	people.add(p3);
	System.out.println("before sorting " + people);

	//Collections.sort(people, (Person per1, Person per2) -> { return per1.getAge() - per2.getAge();});

        PersonSortByAge sortByAge = new PersonSortByAge();

        Collections.sort(people,sortByAge::compare);

	System.out.println("after sorting " + people);

    }

}