package com.joaosalvalagio.lagrimadealuno.services;
import com.joaosalvalagio.lagrimadealuno.repositories.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
}
