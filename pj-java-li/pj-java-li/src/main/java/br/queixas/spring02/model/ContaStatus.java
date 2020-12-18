package br.queixas.spring02.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ContaStatus {
    private String agente;
    private int status;
    private long count;

    public ContaStatus(String agente, int status, long count) {
        this.agente = agente;
        this.status = status;
        this.count = count;
    }
    
}
