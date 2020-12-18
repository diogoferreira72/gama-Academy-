package br.myproject.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // será armanzenado no banco dados em uma tabela
@Table(name = "mtb310_transaction") // ligar com tabela
public class Transacao {
    
    // Atributos

    @Id // ligar com coluna e chave primária
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremento
    @Column(name = "id_transacao") // nome da coluna
    private int idTransacao;

    // correspondencia tipo JAVA com tipo Banco Dados
    @Column(name = "data_hora",  nullable = false)
    private String dataHora;

    @Column(name = "dispositivo",  nullable = false)
    private float dispositivo;

    @Column(name = "valor_solic",  nullable = false)
    private float valorSolicitado;

    @Column(name = "valor_aut",  nullable = false)
    private float valorAutorizado;

    @Column(name = "status",  nullable = false)
    private float status;

/*     @Column(name = "ag_financeiro",  nullable = false)
    private float agente; */


          // 1 Agente faz 1 Transações e um Agente tem vários Transações
          @ManyToOne
          @JoinColumn(name = "id_agente")
          // evitar looping - no JSON se estiver listando Transações não mostrar Agente duplicado
          @JsonIgnoreProperties("transacoes")


        
    // Métodos

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public float getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(float dispositivo) {
        this.dispositivo = dispositivo;
    }

    public float getValorSolicitado() {
        return valorSolicitado;
    }

    public void setValorSolicitado(float valorSolicitado) {
        this.valorSolicitado = valorSolicitado;
    }

    public float getValorAutorizado() {
        return valorAutorizado;
    }

    public void setValorAutorizado(float valorAutorizado) {
        this.valorAutorizado = valorAutorizado;
    }

    public float getStatus() {
        return status;
    }

    public void setStatus(float status) {
        this.status = status;
    }

/*     public float getAgente() {
        return agente;
    }

    public void setAgente(float agente) {
        this.agente = agente; 
    } */
   
}
