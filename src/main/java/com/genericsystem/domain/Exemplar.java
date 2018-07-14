package com.genericsystem.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "EmprestimoExemplar")
public class Exemplar extends AbstractEntity {

    @Column(length = 100,nullable = false,unique = true)
    private String Codigo;
    @Column(length = 10,nullable = false,unique = true)
    private Integer prazoDevolucao;

    public String getCodigo(){
        return Codigo;
    }
    public void setCodigo(String Codigo){
        this.Codigo = Codigo;
    }
    public Integer getprazoDevolucao() {
        return prazoDevolucao;
    }

    public void setprazoDevolucao(Integer prazoDevolucao) {
        this.prazoDevolucao = prazoDevolucao;
    }

   @Override
    public void updateParameters(Object entity) {
        Exemplar outro = (Exemplar) entity;
        this.Codigo = outro.Codigo;
        this.prazoDevolucao = outro.prazoDevolucao;
    }
}