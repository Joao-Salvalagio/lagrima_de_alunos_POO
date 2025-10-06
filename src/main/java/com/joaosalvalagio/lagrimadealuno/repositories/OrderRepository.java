package com.joaosalvalagio.lagrimadealuno.repositories;

import com.joaosalvalagio.lagrimadealuno.models.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Long> {
}
