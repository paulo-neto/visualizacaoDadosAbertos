package si.dce.ufpb.br.visualizacaodadosabertos.comparator;

import java.util.Comparator;

import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Despesa;

public class DespesaValorLiquidoComparator implements Comparator<Despesa> {

	@Override
	public int compare(Despesa o1, Despesa o2) {
		return o1.getVlrLiquido().compareTo(o2.getVlrLiquido());
	}

}
