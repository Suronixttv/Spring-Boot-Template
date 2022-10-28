package de.suronix.springstarter.repositories;

import de.suronix.springstarter.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}