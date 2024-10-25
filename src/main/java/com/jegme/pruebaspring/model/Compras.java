package com.jegme.pruebaspring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Compras {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private long Id;

    @Column(name = "id_usuario")
    @Getter
    @Setter
    private String idUser;

    @Column(name = "contenido")
    @Getter
    @Setter
    private String conten;

    @Column(name = "codigobarras")
    @Getter
    @Setter
    private String barcord;

    @Column
    @Getter
    @Setter
    private String fecha_compra;

}
