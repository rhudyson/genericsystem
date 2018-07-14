package com.genericsystem.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Emprestimo")
public class Emprestimo extends AbstractEntity {

    @Column(length = 10,nullable = false,unique = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmprestimo;
    

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

   @Override
    public void updateParameters(Object entity) {
        Emprestimo outro = (Emprestimo) entity;
       this.dataEmprestimo = outro.dataEmprestimo;
    }
}