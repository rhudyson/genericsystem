package com.genericsystem.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "Reserva")
public class Reserva extends AbstractEntity {

    @Column(length = 10,nullable = false,unique = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Previsao;
    @Column(length = 100,nullable = false,unique = false)
    private Boolean Concluida;
    
    public Date getPrevisao() {
        return Previsao;
    }

    public void setPrevisao(Date Previsao) {
        this.Previsao = Previsao;
    }
    
    public Boolean getConcluida(){
        return Concluida;
    }
    public void setConcluida(Boolean Concluida){
        this.Concluida = Concluida;
    }

   @Override
    public void updateParameters(Object entity) {
        Reserva outro = (Reserva) entity;
       this.Previsao = outro.Previsao;
       this.Concluida= outro.Concluida;
    }
}