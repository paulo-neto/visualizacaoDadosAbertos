package si.dce.ufpb.br.visualizacaodadosabertos.controller;

import java.util.Collection;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.collections.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.common.collect.Lists;

import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Despesa;
import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Orgao;
import si.dce.ufpb.br.visualizacaodadosabertos.parser.OrgaoParser;
import si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes.DadosAbertosService;
import si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes.OrgaoService;
import si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes.ParseService;
import si.dce.ufpb.br.visualizacaodadosabertos.util.DadosAbertosUtil;
import si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes.VisualizacaoDadosAbertosException;


/**
 * Created by paulo on 08/02/16.
 */
@Controller
@RequestMapping(value = "/api/parser")
public class DadosAbertosController{

    private String diretorioDadosXml = "/dadosXml/";
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ParseService parseService;
    
    @Autowired
    private OrgaoService orgaoService;
    
    @Autowired
    private DadosAbertosService dadosAbertosService;
    
    @Autowired
    private DadosAbertosUtil dadosAbertosUtil;

    @RequestMapping(value = "/despesas",method = RequestMethod.GET)
    public ResponseEntity<?> obterTodosAtivos()throws VisualizacaoDadosAbertosException{
    	List<Orgao> orgaos = orgaoService.obterTodosAtivos();
        return new ResponseEntity<Orgao>(!orgaos.isEmpty() ? orgaos.get(0) : new Orgao(), HttpStatus.OK);
    }
    
    @RequestMapping(value = "/atualizar-dados",method = RequestMethod.GET)
    public ResponseEntity<?> atualizarBase() throws VisualizacaoDadosAbertosException{
    	try{
    		dadosAbertosService.limparBD();
        	String caminho = obterCaminhoDadosXml("AnoAnterior.xml");
        	OrgaoParser orgaoParser = parseService.lerXml(caminho);
        	Orgao orgao = orgaoParser.getOrgao();
        	orgao = orgaoService.salvar(orgao) ;
        	return new ResponseEntity<String>("Base atualizada.",HttpStatus.OK);
    	}catch(Exception e){
    		return new ResponseEntity<String>("Erro ao atualizar a base.",HttpStatus.INTERNAL_SERVER_ERROR);
    	}	
    }

    private String obterCaminhoDadosXml(String nomeArquivo){
        if(nomeArquivo == null || nomeArquivo.isEmpty()){
            return "";
        }
        ServletContext servletContext = request.getServletContext();
        return servletContext.getRealPath(diretorioDadosXml+nomeArquivo);
    }


}
