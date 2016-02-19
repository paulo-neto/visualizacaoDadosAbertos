package si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Orgao;
import si.dce.ufpb.br.visualizacaodadosabertos.repository.implementacoes.OrgaoRepositoryCustom;
import si.dce.ufpb.br.visualizacaodadosabertos.repository.intefaces.OrgaoRepository;
import si.dce.ufpb.br.visualizacaodadosabertos.service.interfaces.IOrgaoService;
import si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes.VisualizacaoDadosAbertosException;

@Service
@Transactional
public class OrgaoService {

	@Autowired
	private OrgaoRepository orgaoRepository;
	@Autowired
	private OrgaoRepositoryCustom repositoryCustom;
	
	
	public Orgao salvar(Orgao entidade) throws VisualizacaoDadosAbertosException {
		return orgaoRepository.save(entidade);
	}

	public List<Orgao> obterTodosAtivos() {
		return repositoryCustom.obterTodosAtivos();
	}

}
