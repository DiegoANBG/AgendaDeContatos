/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author aluno
 */
@Entity
@Table(catalog = "bd_fatec", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agenda.findAll", query = "SELECT a FROM Agenda a"),
    @NamedQuery(name = "Agenda.findById", query = "SELECT a FROM Agenda a WHERE a.id = :id"),
    @NamedQuery(name = "Agenda.findByNome", query = "SELECT a FROM Agenda a WHERE a.nome = :nome"),
    @NamedQuery(name = "Agenda.findBySexo", query = "SELECT a FROM Agenda a WHERE a.sexo = :sexo"),
    @NamedQuery(name = "Agenda.findByFoneRes", query = "SELECT a FROM Agenda a WHERE a.foneRes = :foneRes"),
    @NamedQuery(name = "Agenda.findByFoneCel", query = "SELECT a FROM Agenda a WHERE a.foneCel = :foneCel"),
    @NamedQuery(name = "Agenda.findByEmail", query = "SELECT a FROM Agenda a WHERE a.email = :email"),
    @NamedQuery(name = "Agenda.findByDataNasc", query = "SELECT a FROM Agenda a WHERE a.dataNasc = :dataNasc"),
    @NamedQuery(name = "Agenda.findBySalario", query = "SELECT a FROM Agenda a WHERE a.salario = :salario")})
public class Agenda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String nome;
    @Basic(optional = false)
    @Column(nullable = false)
    private Character sexo;
    @Basic(optional = false)
    @Column(name = "fone_res", nullable = false, length = 15)
    private String foneRes;
    @Basic(optional = false)
    @Column(name = "fone_cel", nullable = false, length = 15)
    private String foneCel;
    @Basic(optional = false)
    @Column(nullable = false, length = 50)
    private String email;
    @Basic(optional = false)
    @Column(name = "data_nasc", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dataNasc;
    @Basic(optional = false)
    @Column(nullable = false)
    private float salario;

    public Agenda() {
    }

    public Agenda(Integer id) {
        this.id = id;
    }

    public Agenda(Integer id, String nome, Character sexo, String foneRes, String foneCel, String email, Date dataNasc, float salario) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.foneRes = foneRes;
        this.foneCel = foneCel;
        this.email = email;
        this.dataNasc = dataNasc;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getFoneRes() {
        return foneRes;
    }

    public void setFoneRes(String foneRes) {
        this.foneRes = foneRes;
    }

    public String getFoneCel() {
        return foneCel;
    }

    public void setFoneCel(String foneCel) {
        this.foneCel = foneCel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agenda)) {
            return false;
        }
        Agenda other = (Agenda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.Agenda[ id=" + id + " ]";
    }
    
}
