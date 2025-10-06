package com.joaosalvalagio.lagrimadealuno.repositories;

import com.joaosalvalagio.lagrimadealuno.models.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<PedidoModel, Long> {
}
