package com.phuclong.milktea.milktea.repository;

import com.phuclong.milktea.milktea.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    public User findByEmail(String username);

}
