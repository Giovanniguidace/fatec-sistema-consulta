package br.gov.sp.fatec.sistemaconsulta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.fatec.sistemaconsulta.entity.Medico;

@Repository
public interface MedicoRepository extends JpaRepository<Medico, Integer>{
    
}
