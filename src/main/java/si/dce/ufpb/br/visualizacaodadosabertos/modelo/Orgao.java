package si.dce.ufpb.br.visualizacaodadosabertos.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Created by paulo on 14/02/16.
 */
@Entity
@Table(name = "TB_ORGAO")
public class Orgao implements Serializable{


	private static final long serialVersionUID = 6094108896591446071L;

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_orgao")
    private Long id;

    @Column(name="no_orgao")
    private String nomeOrgao;
    
    @OneToMany(mappedBy = "orgao", fetch = FetchType.EAGER,cascade = {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REFRESH})
    private Set<Despesa> despesas;

    @Temporal(value=TemporalType.TIMESTAMP)
    @Column(name="dt_atualizacao")
    private Date dataAtualizacao;
    
    private boolean registroAtivo;

    public Orgao() {
        setRegistroAtivo(true);
        setDespesas(new HashSet<Despesa>());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Despesa> getDespesas() {
        return despesas;
    }

    public void setDespesas(Set<Despesa> despesas) {
        this.despesas = despesas;
    }

    public boolean isRegistroAtivo() {
        return registroAtivo;
    }

    public void setRegistroAtivo(boolean registroAtivo) {
        this.registroAtivo = registroAtivo;
    }

    /**
	 * @return the nomeOrgao
	 */
	public String getNomeOrgao() {
		return nomeOrgao;
	}

	/**
	 * @param nomeOrgao the nomeOrgao to set
	 */
	public void setNomeOrgao(String nomeOrgao) {
		this.nomeOrgao = nomeOrgao;
	}

	public Despesa addDespesa(Despesa despesa){
        getDespesas().add(despesa);
        despesa.setOrgao(this);
        return despesa;
    }

    public void removeDespesa(Despesa despesa){
        getDespesas().remove(despesa);
        despesa.setOrgao(null);
    }

	/**
	 * @return the dataAtualizacao
	 */
	public Date getDataAtualizacao() {
		return dataAtualizacao;
	}

	/**
	 * @param dataAtualizacao the dataAtualizacao to set
	 */
	public void setDataAtualizacao(Date dataAtualizacao) {
		this.dataAtualizacao = dataAtualizacao;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dataAtualizacao == null) ? 0 : dataAtualizacao.hashCode());
		result = prime * result
				+ ((despesas == null) ? 0 : despesas.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((nomeOrgao == null) ? 0 : nomeOrgao.hashCode());
		result = prime * result + (registroAtivo ? 1231 : 1237);
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
		Orgao other = (Orgao) obj;
		if (dataAtualizacao == null) {
			if (other.dataAtualizacao != null) {
				return false;
			}
		} else if (!dataAtualizacao.equals(other.dataAtualizacao)) {
			return false;
		}
		if (despesas == null) {
			if (other.despesas != null) {
				return false;
			}
		} else if (!despesas.equals(other.despesas)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (nomeOrgao == null) {
			if (other.nomeOrgao != null) {
				return false;
			}
		} else if (!nomeOrgao.equals(other.nomeOrgao)) {
			return false;
		}
		if (registroAtivo != other.registroAtivo) {
			return false;
		}
		return true;
	}
}
