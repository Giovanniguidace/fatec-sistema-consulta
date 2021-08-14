package br.gov.sp.fatec.sistemaconsulta.entity;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="tb_consulta")
public class Consulta{

    
    @Id
    @Column(name = "con_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long con_id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "pac_cpf")
    private Paciente paciente;

    @OneToOne
    @MapsId
    @JoinColumn(name = "med_crm")
    private Medico medico;

    @Column(name="con_dataconsulta")
    @NotNull
    private String con_dataconsulta;

    @Column(name="con_horaconsulta")
    @NotNull
    private String con_horaconsulta;

    @Column(name="con_sala")
    @NotNull
    private String con_sala;

    @Column(name="con_observacao")
    private String con_observacao;

    public Long getCon_id() {
        return con_id;
    }
    public void setCon_id(Long con_id) {
        this.con_id = con_id;
    }
    public String getCon_dataconsulta() {
        return con_dataconsulta;
    }
    public void setCon_dataconsulta(String con_dataconsulta) {
        this.con_dataconsulta = con_dataconsulta;
    }
    public String getCon_horaconsulta() {
        return con_horaconsulta;
    }
    public void setCon_horaconsulta(String con_horaconsulta) {
        this.con_horaconsulta = con_horaconsulta;
    }
    public String getCon_sala() {
        return con_sala;
    }
    public void setCon_sala(String con_sala) {
        this.con_sala = con_sala;
    }
    public String getCon_observacao() {
        return con_observacao;
    }
    public void setCon_observacao(String con_observacao) {
        this.con_observacao = con_observacao;
    }
    public Paciente getPaciente() {
        return paciente;
    }
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    
   
}