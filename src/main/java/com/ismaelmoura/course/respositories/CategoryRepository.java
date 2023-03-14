package com.ismaelmoura.course.respositories;

import com.ismaelmoura.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
