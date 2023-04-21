package com.example.m5apirestpostgresql.repository;

import com.example.m5apirestpostgresql.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
