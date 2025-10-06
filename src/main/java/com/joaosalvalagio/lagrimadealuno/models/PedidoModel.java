package com.joaosalvalagio.lagrimadealuno.models;

import com.joaosalvalagio.lagrimadealuno.enums.PedidoStatus;
import jakarta.persistence.*;
import org.springframework.objenesis.instantiator.perc.PercInstantiator;

@Entity
@Table(name = "Pedidos")
public class PedidoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Double preco;

    private PedidoStatus status;

    public void setId(Long id) {
        this.id = id;
    }

    public PedidoStatus getStatus() {
        return status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }

    public PedidoModel() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
