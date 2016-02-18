package si.dce.ufpb.br.visualizacaodadosabertos.repository.intefaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Orgao;

@Repository
public interface OrgaoRepository extends CrudRepository<Orgao,Long>{

}
