package ru.cygnus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.cygnus.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
