package si.dce.ufpb.br.visualizacaodadosabertos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes.ParseService;

/**
 * Created by paulo on 08/02/16.
 */
@Controller
@RequestMapping(value = "/api/index")
public class IndexController {

    @Autowired
    private ParseService parseService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> olaMundo(){
        return new ResponseEntity<String>("Ol\u00E1 mundo", HttpStatus.OK);
    }

}
