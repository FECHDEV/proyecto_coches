package com.project.coches.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter @Setter
@Embeddable
public class CocheCompraPK implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "compras_numero_factura")
    private Integer compraNumeroFactura;

    @Column(name = "coches_codigo_coche")
    private Integer codeCar;
}
