package br.gov.sp.fatec.sistemaconsulta.entity;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="tb_medico")
public class Medico{

    @Id
    @Column(name="med_crm")
    private Integer med_crm;

    @Column(name="med_nome")
    @NotNull
    private String med_nome;

    @Column(name="med_especialidade")
    @NotNull
    private String med_especialidade;

    public Integer getMed_crm() {
        return med_crm;
    }

    public void setMed_crm(Integer med_crm) {
        this.med_crm = med_crm;
    }

    public String getMed_nome() {
        return med_nome;
    }

    public void setMed_nome(String med_nome) {
        this.med_nome = med_nome;
    }

    public String getMed_especialidade() {
        return med_especialidade;
    }

    public void setMed_especialidade(String med_especialidade) {
        this.med_especialidade = med_especialidade;
    }

    
    /*@OneToMany(
        mappedBy = "medico",
        cascade = CascadeType.ALL,
        orphanRemoval = true
    )
    private List<Consulta> consultas;*/

}