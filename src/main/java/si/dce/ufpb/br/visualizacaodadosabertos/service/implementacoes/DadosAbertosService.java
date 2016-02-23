package si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes;

import java.math.BigInteger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes.VisualizacaoDadosAbertosException;

@Service
public class DadosAbertosService {

	@PersistenceContext
	private EntityManager entityManager;

	public void limparBD() throws VisualizacaoDadosAbertosException{
		try{
			String countOrtgao = "SELECT COUNT(*) FROM TB_ORGAO";
			Query query = entityManager.createNativeQuery(countOrtgao);
			BigInteger countOr = (BigInteger) query.getSingleResult();
			if(countOr != null && countOr.intValue() > 0){
				String limparTableDespesa = "DELETE FROM TB_DESPESA WHERE id_despesa > 0";
				String limparTableOrgao = "DELETE FROM TB_ORGAO WHERE id_orgao > 0";
				query = entityManager.createQuery(limparTableDespesa); 
				query.executeUpdate();
				query = entityManager.createQuery(limparTableOrgao);
				query.executeUpdate();
			}
		}catch(Exception e){
			throw new VisualizacaoDadosAbertosException(e.getMessage());
		}
	}
	
	
}
