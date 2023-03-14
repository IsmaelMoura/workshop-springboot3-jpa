package com.ismaelmoura.course.respositories;

import com.ismaelmoura.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
