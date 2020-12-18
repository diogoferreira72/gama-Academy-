package br.myproject.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity // será armanzenado no banco dados em uma tabela
@Table(name = "mtb310_ag_financeiro") // ligar com tabela
public class Agente {
      // Atributos

      @Id // ligar com coluna e chave primária
      @GeneratedValue(strategy = GenerationType.IDENTITY) // auto-incremento
      @Column(name = "id_agente") // nome da coluna
      private int id;
  
      // correspondencia tipo JAVA com tipo Banco Dados
      @Column(name = "nome_agente", length = 100, nullable = false)
      private String nome;
  
      @Column(name = "volume_financeiro",  nullable = false)
      private float volume;

        // 1 Agente faz 1 Transações e um Agente tem vários Transações
        @OneToMany(mappedBy = "mtb310_transaction")
        // evitar looping - no JSON se estiver listando Transações não mostrar Agente duplicado
        @JsonIgnoreProperties("mtb310_transaction")
        private List<Transacao> transacoes;


      
      // Métodos
      public int getId() {
          return id;
      }

      public void setId(int id) {
          this.id = id;
      }

      public String getNome() {
          return nome;
      }

      public void setNome(String nome) {
          this.nome = nome;
      }

      public float getVolume() {
          return volume;
      }

      public void setVolume(float volume) {
          this.volume = volume;
      }

  
    
}
