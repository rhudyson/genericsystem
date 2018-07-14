package com.genericsystem.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "EmprestimoExemplar")
public class EmprestimoExemplar extends AbstractEntity {

    @Column(length = 10,nullable = false,unique = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Devolucao;
    

    public Date getDevolucao() {
        return Devolucao;
    }

    public void setDevolucao(Date Devolucao) {
        this.Devolucao = Devolucao;
    }

   @Override
    public void updateParameters(Object entity) {
        EmprestimoExemplar outro = (EmprestimoExemplar) entity;
       this.Devolucao = outro.Devolucao;
    }
}