package teste.samuel.modelo;

import java.util.HashSet;
import java.util.Set;

public class Student {

    private String      name;
    private Set<String> book;

    public void addBook(String book) {
	if (this.getBook() == null) {
	    this.setBook(new HashSet<>());
	}
	this.getBook().add(book);
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Set<String> getBook() {
	return book;
    }

    public void setBook(Set<String> book) {
	this.book = book;
    }
}
