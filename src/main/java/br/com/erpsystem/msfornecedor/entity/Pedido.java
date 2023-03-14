package br.com.erpsystem.msfornecedor.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.UUID;


@Entity(name = "TB_02_PEDIDO")
public class Pedido {


    @Column(name = "valor_total", unique = true)
    private BigDecimal valorTotal;

    @Column(name = "cliente_id", unique = true)
    private UUID clienteId;
}
