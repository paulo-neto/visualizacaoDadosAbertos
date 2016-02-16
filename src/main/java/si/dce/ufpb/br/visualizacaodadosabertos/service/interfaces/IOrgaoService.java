package si.dce.ufpb.br.visualizacaodadosabertos.service.interfaces;

import java.util.List;

import si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes.VisualizacaoDadosAbertosException;

public interface IOrgaoService<T> {

	public T salvar(T entidade) throws VisualizacaoDadosAbertosException;
	public List<T> obterTodosAtivos();
}
