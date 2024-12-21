package org.cepapplication.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


import javax.persistence.Entity;
import javax.persistence.Id;
@Getter
@Setter
@Table(name = "logs")
@Entity
public class ConsultaLogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cepConsultado;
    private String resultado;

    @Column(name = "data_hora_consulta", nullable = false, updatable = false)
    private java.time.LocalDateTime dataHoraConsulta;

    public ConsultaLogEntity(String cepConsultado, String resultado) {
        this.cepConsultado = cepConsultado;
        this.resultado = resultado;
        this.dataHoraConsulta = java.time.LocalDateTime.now();
    }

    public ConsultaLogEntity() {}

}
