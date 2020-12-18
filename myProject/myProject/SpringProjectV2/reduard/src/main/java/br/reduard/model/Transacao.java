package br.reduard.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // será armanzenado no banco dados em uma tabela
@Table(name = "mtb310_transaction") // ligar com tabela
public class Transacao {
       // Atributos

       @Id // ligar com coluna e chave primária
       @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremento
       @Column(name = "id_transacao") // nome da coluna
       private int idTransacao;
   
       // correspondencia tipo JAVA com tipo Banco Dados
       @Column(name = "data_hora",  length = 19,  nullable = false)
       private String dataHora;
   
       @Column(name = "dispositivo",  nullable = false)
       private float dispositivo;
   
       @Column(name = "valor_solic",  nullable = false)
       private float valorSolicitado;
   
       @Column(name = "valor_aut",  nullable = false)
       private float valorAutorizado;
   
       @Column(name = "status",  nullable = false)
       private int status;
   

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

       public int getStatus() {
           return status;
       }

       public void setStatus(int status) {
           this.status = status;
       }

      
    
}
