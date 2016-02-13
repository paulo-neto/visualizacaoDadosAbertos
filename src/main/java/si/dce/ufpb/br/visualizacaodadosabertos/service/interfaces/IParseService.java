package si.dce.ufpb.br.visualizacaodadosabertos.service.interfaces;

import si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes.VisualizacaoDadosAbertosException;

/**
 * Created by paulo on 09/02/16.
 */
public interface IParseService<T> {

    public T lerXml(String nomeArquivo) throws VisualizacaoDadosAbertosException;
}
