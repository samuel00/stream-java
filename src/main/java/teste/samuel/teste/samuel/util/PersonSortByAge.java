package teste.samuel.teste.samuel.util;

import teste.samuel.modelo.Person;

public class PersonSortByAge {

    public int compare(Person p1, Person p2) {
	return p1.getAge() - p2.getAge();
    }


}
