package si.dce.ufpb.br.visualizacaodadosabertos.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Orgao;
import si.dce.ufpb.br.visualizacaodadosabertos.parser.OrgaoParser;
import si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes.OrgaoService;
import si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes.ParseService;
import si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes.VisualizacaoDadosAbertosException;


/**
 * Created by paulo on 08/02/16.
 */
@Controller
@RequestMapping(value = "/api/parser")
public class ParserController{

    private String diretorioDadosXml = "/dadosXml/";
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ParseService parseService;
    
    @Autowired
    private OrgaoService orgaoService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> parserXmlToBd()throws VisualizacaoDadosAbertosException{
        String caminho = obterCaminhoDadosXml("dados.xml");
        OrgaoParser orgaoParser = parseService.lerXml(caminho);
        Orgao orgao = orgaoParser.getOrgao();
        orgao = orgaoService.salvar(orgao) ;
        return new ResponseEntity<Orgao>(orgao, HttpStatus.OK);
    }

    private String obterCaminhoDadosXml(String nomeArquivo){
        if(nomeArquivo == null || nomeArquivo.isEmpty()){
            return "";
        }
        ServletContext servletContext = request.getServletContext();
        return servletContext.getRealPath(diretorioDadosXml+nomeArquivo);
    }


}
