package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ru.kata.spring.boot_security.demo.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
    User findUserByName(String name);
}
