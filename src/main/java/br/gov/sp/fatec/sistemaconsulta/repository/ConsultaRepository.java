package br.gov.sp.fatec.sistemaconsulta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.sistemaconsulta.entity.Consulta;


@Repository
public interface ConsultaRepository extends JpaRepository<Consulta, Long>{
    
}
