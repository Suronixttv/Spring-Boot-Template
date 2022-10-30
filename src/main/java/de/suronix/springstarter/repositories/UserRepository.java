package de.suronix.springstarter.repositories;

import de.suronix.springstarter.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    @Transactional
    User findByUsername(String username);
}