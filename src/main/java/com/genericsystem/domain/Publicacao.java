package com.genericsystem.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Publicacao")
public class Publicacao extends AbstractEntity {

    @Column(length = 100,nullable = false,unique = false)
    private String Isbn;
    @Column(length = 100,nullable = false,unique = false)
    private String Titulo;

    public String getIsbn(){
        return Isbn;
    }
    public void setIsbn(String Isbn){
        this.Isbn = Isbn;
    }
    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

   @Override
    public void updateParameters(Object entity) {
        Publicacao outro = (Publicacao) entity;
        this.Isbn = outro.Isbn;
        this.Titulo = outro.Titulo;
    }
}