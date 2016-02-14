package si.dce.ufpb.br.visualizacaodadosabertos.modelo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by paulo on 14/02/16.
 */
@Entity
@Table(name = "TB_ORGAO")
public class Orgao implements Serializable{


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id_orgao")
    private Long id;

    @OneToMany(mappedBy = "orgao", cascade = {CascadeType.PERSIST, CascadeType.MERGE,CascadeType.REFRESH})
    private Set<Despesa> despesas;

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

    public Despesa addDespesa(Despesa despesa){
        getDespesas().add(despesa);
        despesa.setOrgao(this);
        return despesa;
    }

    public void removeDespesa(Despesa despesa){
        getDespesas().remove(despesa);
        despesa.setOrgao(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orgao orgao = (Orgao) o;

        if (registroAtivo != orgao.registroAtivo) return false;
        if (id != null ? !id.equals(orgao.id) : orgao.id != null) return false;
        return !(despesas != null ? !despesas.equals(orgao.despesas) : orgao.despesas != null);

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (despesas != null ? despesas.hashCode() : 0);
        result = 31 * result + (registroAtivo ? 1 : 0);
        return result;
    }
}
