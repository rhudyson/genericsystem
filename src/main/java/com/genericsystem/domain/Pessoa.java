package com.genericsystem.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Pessoa")
public class Pessoa extends AbstractEntity{

    @Column(length = 100,nullable = false,unique = false)
    private String Nome;
    @Column(length = 100,nullable = true,unique = false)
    private String Email;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getEmail(){
        return Email;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    @Override
    public void updateParameters(Object entity) {
        Pessoa outro = (Pessoa) entity;
        this.Nome = outro.Nome;
        this.Email = outro.Email;
    }
    
}

