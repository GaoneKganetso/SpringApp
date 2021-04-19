package guru.springFramework.spring5webapp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;

    private Set<Book> books= new HashSet<>();

    public Author(){

    }

    public Author(String firstname, String lastname,Set<Book> books){
        this.firstname = firstname;
        this.lastname = lastname;
        this.books = books;
    }

    public String getFirstname(){return firstname;}

    public void setFirstname(String firstname) { this.firstname = firstname;}

    public String getLastname(){return lastname;}

    public void setLastname(String lastname) {this.lastname = lastname;}

    public Set<Book>  getBooks(){return  this.books;}

    public void setBooks(Set<Book> books){this.books = books;}

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return id.equals(author.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", books=" + books +
                '}';
    }
}
