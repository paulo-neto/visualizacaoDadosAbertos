package si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes;

import org.springframework.stereotype.Service;
import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Orgao;
import si.dce.ufpb.br.visualizacaodadosabertos.service.interfaces.IParseService;
import si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes.VisualizacaoDadosAbertosException;

/**
 * Created by paulo on 09/02/16.
 */
@Service
public class ParseService implements IParseService<Orgao>  {

    @Override
    public Orgao lerXml(String caminhoArquivo) throws VisualizacaoDadosAbertosException {
        return null;
    }
}
