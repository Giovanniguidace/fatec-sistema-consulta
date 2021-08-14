package br.gov.sp.fatec.sistemaconsulta;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import br.gov.sp.fatec.sistemaconsulta.entity.Consulta;
import br.gov.sp.fatec.sistemaconsulta.entity.Medico;
import br.gov.sp.fatec.sistemaconsulta.entity.Paciente;
import br.gov.sp.fatec.sistemaconsulta.repository.ConsultaRepository;
import br.gov.sp.fatec.sistemaconsulta.repository.MedicoRepository;
import br.gov.sp.fatec.sistemaconsulta.repository.PacienteRepository;

@SpringBootTest
@Transactional
@Rollback
class SistemaConsultaApplicationTests {

	@Autowired
	private PacienteRepository pacienteRepo;

	@Autowired
	private MedicoRepository medicoRepo;

	@Autowired
	private ConsultaRepository consultaRepo;

	@Test
	void contextLoads() {
	}

	// TESTAR A INSERÇÃO DE DADOS NA TABELA TB_PACIENTE;
	@Test
	void testeInsercaoPaciente(){
		Paciente paciente = new Paciente();
		paciente.setPac_cpf(33444344);
		paciente.setPac_nome("Reginaldo de Souza");
		paciente.setPac_datanascimento("14/04/2001");
		paciente.setPac_sexo("Masculino");
		pacienteRepo.save(paciente);

		assertNotNull(paciente.getPac_cpf());
	}

	// TESTAR A INSERÇÃO DE DADOS NA TABELA TB_MEDICO;
	@Test
	void testeInsercaoMedico(){
		Medico medico = new Medico();
		medico.setMed_crm(343434342);
		medico.setMed_nome("Norberto Husshell");
		medico.setMed_especialidade("Pediatria");
		medicoRepo.save(medico);
		assertNotNull(medico.getMed_crm());
	}

	
}
