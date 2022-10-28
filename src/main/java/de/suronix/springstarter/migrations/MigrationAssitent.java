package de.suronix.springstarter.migrations;

import de.suronix.springstarter.model.Author;
import de.suronix.springstarter.model.Book;
import de.suronix.springstarter.repositories.AuthorRepository;
import de.suronix.springstarter.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class MigrationAssitent implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public MigrationAssitent(AuthorRepository authorRepository, BookRepository bookRepository){
        this.authorRepository=authorRepository;
        this.bookRepository=bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author erik = new Author("erik", "LOLOLO");
        Book testbook = new Book("HSHS4483720383262798","KEKS BLEIBEN SO");
        testbook.setauthor(erik);
        erik.getBooks().add(testbook);

        authorRepository.save(erik);
        bookRepository.save(testbook);

        Author rod = new Author("Rod", "Johnsen");
        Book ddd = new Book("FG32345235","Way to null");
        rod.getBooks().add(ddd);
        ddd.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(ddd);

        System.out.println("------------------STARTE TESTDATEN MIGRATION---------------------");
    }
}
