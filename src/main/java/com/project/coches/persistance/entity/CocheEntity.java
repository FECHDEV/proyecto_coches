package com.project.coches.persistance.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "coches")
public class CocheEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_coche")
    private Integer codeCar;

    @Column(name = "marca_coche_id")
    private Integer marcaCocheId;

    @Column(name = "referencia")
    private String reference;

    @Column(name = "precio")
    private Double price;

    @Column(name = "anio_modelo")
    private Double yearModel;

    private String color;

    @Column(name = "numeros_caballos_fuerza")
    private Double horsepower;

    @Column(name = "cantidad_puertas")
    private Integer numberDoor;

    @Column(name = "cilindraje")
    private Double engineDisplacement;

    @Column(name = "transmision")
    private String transmission;

    @Column(name = "tipo_combustible")
    private String fuelType;

    @Column(name = "cantidad_asientos")
    private Integer numberSeat;

    @Column(name = "traccion")
    private Integer traction;

    @Column(name = "direccion")
    private String steering;

    @Column(name = "categoria")
    private String category;

    @Column(name = "ruta_imagen")
    private String imagePath;

    @ManyToOne
    @JoinColumn(name = "marca_coche_id", insertable = false, updatable = false)
    private MarcaCocheEntity marcaCocheEntity;

    @OneToMany(mappedBy = "cocheEntity")
    private List<CocheCompraEntity> cocheCompraEntity;

}
