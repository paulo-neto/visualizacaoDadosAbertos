package si.dce.ufpb.br.visualizacaodadosabertos.repository.implementacoes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Orgao;

@Repository
public class OrgaoRepositoryCustom {

	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Orgao> obterTodosAtivos(){
		Session session = (Session) entityManager.unwrap(Session.class);
		Criteria criteria = session.createCriteria(Orgao.class);
		criteria.add(Restrictions.eq("registroAtivo", true));
		return criteria.list();
		
	}
}
