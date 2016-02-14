package si.dce.ufpb.br.visualizacaodadosabertos.parser;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.List;

/**
 * Created by paulo on 09/02/16.
 */
@XStreamAlias("orgao")
public class OrgaoParser implements Serializable {


    private List<DespesaParser> despesaParsers;

    public List<DespesaParser> getDespesaParsers() {
        return despesaParsers;
    }

    public void setDespesaParsers(List<DespesaParser> despesaParsers) {
        this.despesaParsers = despesaParsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrgaoParser orgaoParser = (OrgaoParser) o;

        return !(despesaParsers != null ? !despesaParsers.equals(orgaoParser.despesaParsers) : orgaoParser.despesaParsers != null);

    }

    @Override
    public int hashCode() {
        return despesaParsers != null ? despesaParsers.hashCode() : 0;
    }
}
