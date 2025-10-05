package com.gestion.gestionParqueadero.model;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class tipoVehiculoEntity {
    @Id
    @Column(name = "id_tipo_vehiculo", nullable = false, unique = true)
    private Long idTipoVehiculo;

}
