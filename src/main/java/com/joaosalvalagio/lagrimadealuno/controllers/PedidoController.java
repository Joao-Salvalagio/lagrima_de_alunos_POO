package com.joaosalvalagio.lagrimadealuno.controllers;

import com.joaosalvalagio.lagrimadealuno.services.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoController {
    @Autowired
    private PedidoService pedidoService;
}
