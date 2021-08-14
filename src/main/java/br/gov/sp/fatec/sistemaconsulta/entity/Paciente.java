package br.gov.sp.fatec.sistemaconsulta.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import javax.validation.constraints.NotNull;


@Entity
@Table(name="tb_paciente")
public class Paciente{

    @Id
    @Column(name="pac_cpf")
    private Integer pac_cpf;

    @Column(name="pac_nome")
    @NotNull
    private String pac_nome;

    @Column(name="pac_datanascimento")
    @NotNull
    private String pac_datanascimento;

    @Column(name="pac_sexo")
    @NotNull
    private String pac_sexo;

    public Integer getPac_cpf() {
        return pac_cpf;
    }
    public void setPac_cpf(Integer pac_cpf) {
        this.pac_cpf = pac_cpf;
    }
    public String getPac_nome() {
        return pac_nome;
    }
    public void setPac_nome(String pac_nome) {
        this.pac_nome = pac_nome;
    }
    public String getPac_datanascimento() {
        return pac_datanascimento;
    }
    public void setPac_datanascimento(String pac_datanascimento) {
        this.pac_datanascimento = pac_datanascimento;
    }
    public String getPac_sexo() {
        return pac_sexo;
    }
    public void setPac_sexo(String pac_sexo) {
        this.pac_sexo = pac_sexo;
    }

    /*@OneToMany(
        mappedBy = "paciente",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Consulta> consultas;*/

   
}