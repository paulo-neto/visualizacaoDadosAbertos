package si.dce.ufpb.br.visualizacaodadosabertos.parser;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.io.Serializable;
import java.util.List;

/**
 * Created by paulo on 09/02/16.
 */
@XStreamAlias("orgao")
public class OrgaoParser implements Serializable {


    /**
	 * 
	 */
	private static final long serialVersionUID = -4371977346547897137L;
	private List<DespesaParser> DESPESAS;
	/**
	 * @return the despesas
	 */
	public List<DespesaParser> getDESPESAS() {
		return DESPESAS;
	}
	/**
	 * @param despesas the despesas to set
	 */
	public void setDESPESAS(List<DespesaParser> despesas) {
		this.DESPESAS = despesas;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((DESPESAS == null) ? 0 : DESPESAS.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		OrgaoParser other = (OrgaoParser) obj;
		if (DESPESAS == null) {
			if (other.DESPESAS != null) {
				return false;
			}
		} else if (!DESPESAS.equals(other.DESPESAS)) {
			return false;
		}
		return true;
	}
}
