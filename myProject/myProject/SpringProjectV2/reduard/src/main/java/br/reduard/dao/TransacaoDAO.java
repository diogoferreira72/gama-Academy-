package br.reduard.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.reduard.model.Transacao;
import br.reduard.dto.ContagemStatusDto;

@Repository
public interface TransacaoDAO extends CrudRepository<Transacao, Integer> {

    @Query(value="SELECT new br.reduard.dto.ContagemStatusDto ('abc', status, COUNT(t.status)) FROM Transacao AS t WHERE t.idTransacao = ?1 GROUP BY  t.status ORDER By status")
    //@Query(value="SELECT new br.reduard.dto.ContagemStatusDto (t.agente.nomeAgente, status, COUNT(t.status)) FROM Transacao AS t WHERE t.agente.idAgente = ?1 GROUP BY t.agente.nomeAgente, t.status ORDER By status")
    public List<ContagemStatusDto> countStatusByAgent(int idAgente); 


}
