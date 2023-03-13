package com.ismaelmoura.course.respositories;

import com.ismaelmoura.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
