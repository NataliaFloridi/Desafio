package org.cepapplication.repository;

import org.cepapplication.model.ConsultaLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CepLogRepository extends JpaRepository<ConsultaLogEntity, Long>{

}
