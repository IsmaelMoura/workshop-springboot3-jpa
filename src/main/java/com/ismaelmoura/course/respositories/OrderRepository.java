package com.ismaelmoura.course.respositories;

import com.ismaelmoura.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
