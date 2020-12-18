package br.myproject.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import br.myproject.model.Transacao;

public interface TransacaoDAO extends CrudRepository<Transacao, Integer>{

    
    // fazendo consulta na mão
    // considerando objetos (não nativa) e não tabelas do banco de dados - mantém a independência
    // só vai ter 2 informações, precisa de um construtor
    @Query(value="Select new Transacao(t.status, count(*) ) from User t where t.id = :agentef group by t.status")
    public Transacao buscaPorId(@Param("agentef") Integer agente);


    // fazendo na mão  - Query Nativa
    @Query(value="Select status, count(*) from mtb310_transaction where ag_financeiro = :agentef group by status", nativeQuery = true)
    public Object buscaPorIdN(@Param("agentef") Integer agente);

    
}
