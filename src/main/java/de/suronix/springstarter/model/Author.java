package de.suronix.springstarter.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = {"id"})
@ToString
@Getter
@Setter
@Entity
public class Author implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;

    private String imageURL;

    public Author(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    private String lastname;

    public Author(String firstname, String imageURL, String lastname, Set<Book> books) {
        this.firstname = firstname;
        this.imageURL = imageURL;
        this.lastname = lastname;
        this.books = books;
    }

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();
}
