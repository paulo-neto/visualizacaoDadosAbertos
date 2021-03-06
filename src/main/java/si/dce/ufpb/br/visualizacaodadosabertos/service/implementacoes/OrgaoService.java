package si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Despesa;
import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Orgao;
import si.dce.ufpb.br.visualizacaodadosabertos.repository.implementacoes.OrgaoRepositoryCustom;
import si.dce.ufpb.br.visualizacaodadosabertos.repository.intefaces.OrgaoRepository;
import si.dce.ufpb.br.visualizacaodadosabertos.service.interfaces.IOrgaoService;
import si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes.VisualizacaoDadosAbertosException;

@Service
@Scope("singleton")
@Transactional
public class OrgaoService {

	@Autowired
	private OrgaoRepository orgaoRepository;
	@Autowired
	private OrgaoRepositoryCustom repositoryCustom;
	
	private static List<Orgao> orgaos = Collections.synchronizedList(new ArrayList<Orgao>());
	
	@PostConstruct
	public void init(){
		List<Orgao> retorno = repositoryCustom.obterTodosAtivos();
		this.orgaos.addAll(retorno);
	}
	
	public Orgao salvar(Orgao entidade) throws VisualizacaoDadosAbertosException {
		return orgaoRepository.save(entidade);
	}

	public List<Orgao> obterTodosAtivos() {
		return repositoryCustom.obterTodosAtivos();
	}
	
	public Orgao getOrgao(){
		return orgaos.get(0);
	}
	/**
	 * Obtem um Map com o total gasto por cada partido
	 * @return
	 */
	public Map<BigDecimal,String> getTotalGastoPorPartido(){
		Map<BigDecimal,String> retorno = new HashMap<BigDecimal,String>();
		Orgao orgao = getOrgao();
		BigDecimal total = new BigDecimal(0);
		for(Despesa despesa:orgao.getDespesas()){
			for(Despesa desp:orgao.getDespesas()){
				if((desp.getSgPartido() != null && despesa.getSgPartido() != null) && desp.getSgPartido().equals(despesa.getSgPartido())){
					total = total.add(desp.getVlrLiquido());
				}
			}
			retorno.put(total,despesa.getSgPartido());
		}
		return retorno;
	}
	
	public Map<BigDecimal,String> getTotalGastoPorParlamentar(){
		Map<BigDecimal,String> retorno = new HashMap<BigDecimal,String>();
		Orgao orgao = getOrgao();
		BigDecimal total = new BigDecimal(0);
		for(Despesa despesa:orgao.getDespesas()){
			for(Despesa desp:orgao.getDespesas()){
				if((desp.getTxNomeParlamentar() != null && despesa.getTxNomeParlamentar() != null) && desp.getTxNomeParlamentar().equals(despesa.getTxNomeParlamentar())){
					total = total.add(desp.getVlrLiquido()).setScale(0, RoundingMode.HALF_EVEN);
				}
			}
			retorno.put(total,despesa.getTxNomeParlamentar());
		}
		return retorno;
	}
	
	public Map<String,BigDecimal> getTotalGastosTelefoniaPorEstadoEparlamentar(String siglaUf){
		Map<String,BigDecimal> retorno = new HashMap<String,BigDecimal>();
		Map<String,String> deputadosPB = new HashMap<String,String>();
		Orgao orgao = getOrgao();
		BigDecimal total = new BigDecimal(0);
		for(Despesa despesa:orgao.getDespesas()){
			for(Despesa desp:orgao.getDespesas()){
				if(siglaUf.equals(desp.getSgUF()) && "TELEFONIA".equals(desp.getTxtDescricao())){
					if((desp.getTxNomeParlamentar() != null && despesa.getTxNomeParlamentar() != null) 
							&& desp.getTxNomeParlamentar().equals(despesa.getTxNomeParlamentar())){
						
						deputadosPB.put(desp.getTxNomeParlamentar(),desp.getTxNomeParlamentar());
					}
				}
			}
		}
		
		for(String depPB: deputadosPB.keySet()){
			for(Despesa despesa:orgao.getDespesas()){
				if((depPB != null && despesa.getTxNomeParlamentar() != null) 
						&& depPB.equals(despesa.getTxNomeParlamentar())){
					total = total.add(despesa.getVlrLiquido()).setScale(0, RoundingMode.HALF_EVEN);
				}
			}
			retorno.put(depPB, total);
			total = new BigDecimal(0);
		}
		
		return retorno;
	}

	public Map<String,Number> getTotalDespesasPorTipo() {
		Map<String,Number> totalPorDespesa = new LinkedHashMap<String, Number>();
		Set<String> desp = new HashSet<String>(); 
		Orgao orgao = getOrgao();
		for(Despesa despesa:orgao.getDespesas()){
			if((despesa.getTxtDescricao() != null && !despesa.getTxtDescricao().isEmpty()) 
					&& !desp.contains(despesa.getTxtDescricao())){
				desp.add(despesa.getTxtDescricao());
			}
		}
		BigDecimal total = new BigDecimal(0);
		for(String des: desp){
			for(Despesa despesa:orgao.getDespesas()){
				if((despesa.getTxtDescricao() != null && !despesa.getTxtDescricao().isEmpty()) 
						&& des.equals(despesa.getTxtDescricao())){
					total = total.add(despesa.getVlrLiquido()).setScale(0, RoundingMode.HALF_EVEN);
				}
			}
			totalPorDespesa.put(des, total);
			total = new BigDecimal(0);
		}
		return totalPorDespesa;
	}
}
