package de.suronix.springstarter.repositories;

import de.suronix.springstarter.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}