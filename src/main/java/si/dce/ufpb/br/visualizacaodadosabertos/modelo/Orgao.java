package si.dce.ufpb.br.visualizacaodadosabertos.modelo;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Despesa;

import java.io.Serializable;
import java.util.List;

/**
 * Created by paulo on 09/02/16.
 */
@XStreamAlias("orgao")
public class Orgao implements Serializable {


    private List<Despesa> despesas;

    public List<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(List<Despesa> despesas) {
        this.despesas = despesas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orgao orgao = (Orgao) o;

        return !(despesas != null ? !despesas.equals(orgao.despesas) : orgao.despesas != null);

    }

    @Override
    public int hashCode() {
        return despesas != null ? despesas.hashCode() : 0;
    }
}
