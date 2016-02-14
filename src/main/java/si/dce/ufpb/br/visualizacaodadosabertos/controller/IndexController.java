package si.dce.ufpb.br.visualizacaodadosabertos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import si.dce.ufpb.br.visualizacaodadosabertos.parser.OrgaoParser;
import si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes.ParseService;
import si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes.VisualizacaoDadosAbertosException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by paulo on 08/02/16.
 */
@Controller
@RequestMapping(value = "/api/index")
public class IndexController extends ControllerUtil{

    private String diretorioDadosXml = "/dadosXml/";
    @Autowired
    private HttpServletRequest request;

    @Autowired
    private ParseService parseService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> olaMundo()throws VisualizacaoDadosAbertosException{
        String caminho = obterCaminhoDadosXml("AnoAtual.xml");
        OrgaoParser orgaoParser = parseService.lerXml(caminho);
        return new ResponseEntity<String>("Ol\u00E1 mundo", HttpStatus.OK);
    }

    private String obterCaminhoDadosXml(String nomeArquivo){
        if(nomeArquivo == null || nomeArquivo.isEmpty()){
            return "";
        }
        ServletContext servletContext = request.getServletContext();
        return servletContext.getRealPath(diretorioDadosXml+nomeArquivo);
    }


}
