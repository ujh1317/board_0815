package com.dobby.board_0815.repository;

import com.dobby.board_0815.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
