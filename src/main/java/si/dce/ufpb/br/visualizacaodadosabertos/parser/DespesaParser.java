package si.dce.ufpb.br.visualizacaodadosabertos.parser;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Created by paulo on 09/02/16.
 */
@XStreamAlias("DESPESA")
public class DespesaParser {

    private String txNomeParlamentar;

    private Long ideCadastro;

    private Long nuCarteiraParlamentar;

    private Long nuLegislatura;

    private String sgUF;

    private String sgPartido;

    private Long codLegislatura;

    private Long numSubCota;

    private String txtDescricao;

    private Long numEspecificacaoSubCota;

    private String txtDescricaoEspecificacao;

    private String txtFornecedor;

    private String txtCNPJCPF;

    private String txtNumero;

    private Long indTipoDocumento;

    private String datEmissao;

    private String vlrDocumento;

    private String vlrGlosa;

    private String vlrLiquido;

    private Long numMes;

    private Long numAno;

    private Long numParcela;

    private String txtPassageiro;

    private String txtTrecho;

    private Long numLote;

    private Long numRessarcimento;

    private String vlrRestituicao;

    private Long nuDeputadoId;

    public String getTxNomeParlamentar() {
        return txNomeParlamentar;
    }

    public void setTxNomeParlamentar(String txNomeParlamentar) {
        this.txNomeParlamentar = txNomeParlamentar;
    }

    public Long getIdeCadastro() {
        return ideCadastro;
    }

    public void setIdeCadastro(Long ideCadastro) {
        this.ideCadastro = ideCadastro;
    }

    public Long getNuCarteiraParlamentar() {
        return nuCarteiraParlamentar;
    }

    public void setNuCarteiraParlamentar(Long nuCarteiraParlamentar) {
        this.nuCarteiraParlamentar = nuCarteiraParlamentar;
    }

    public Long getNuLegislatura() {
        return nuLegislatura;
    }

    public void setNuLegislatura(Long nuLegislatura) {
        this.nuLegislatura = nuLegislatura;
    }

    public String getSgUF() {
        return sgUF;
    }

    public void setSgUF(String sgUF) {
        this.sgUF = sgUF;
    }

    public String getSgPartido() {
        return sgPartido;
    }

    public void setSgPartido(String sgPartido) {
        this.sgPartido = sgPartido;
    }

    public Long getCodLegislatura() {
        return codLegislatura;
    }

    public void setCodLegislatura(Long codLegislatura) {
        this.codLegislatura = codLegislatura;
    }

    public Long getNumSubCota() {
        return numSubCota;
    }

    public void setNumSubCota(Long numSubCota) {
        this.numSubCota = numSubCota;
    }

    public String getTxtDescricao() {
        return txtDescricao;
    }

    public void setTxtDescricao(String txtDescricao) {
        this.txtDescricao = txtDescricao;
    }

    public Long getNumEspecificacaoSubCota() {
        return numEspecificacaoSubCota;
    }

    public void setNumEspecificacaoSubCota(Long numEspecificacaoSubCota) {
        this.numEspecificacaoSubCota = numEspecificacaoSubCota;
    }

    public String getTxtDescricaoEspecificacao() {
        return txtDescricaoEspecificacao;
    }

    public void setTxtDescricaoEspecificacao(String txtDescricaoEspecificacao) {
        this.txtDescricaoEspecificacao = txtDescricaoEspecificacao;
    }

    public String getTxtFornecedor() {
        return txtFornecedor;
    }

    public void setTxtFornecedor(String txtFornecedor) {
        this.txtFornecedor = txtFornecedor;
    }

    public String getTxtCNPJCPF() {
        return txtCNPJCPF;
    }

    public void setTxtCNPJCPF(String txtCNPJCPF) {
        this.txtCNPJCPF = txtCNPJCPF;
    }

    public String getTxtNumero() {
        return txtNumero;
    }

    public void setTxtNumero(String txtNumero) {
        this.txtNumero = txtNumero;
    }

    public Long getIndTipoDocumento() {
        return indTipoDocumento;
    }

    public void setIndTipoDocumento(Long indTipoDocumento) {
        this.indTipoDocumento = indTipoDocumento;
    }

    public String getDatEmissao() {
        return datEmissao;
    }

    public void setDatEmissao(String datEmissao) {
        this.datEmissao = datEmissao;
    }

    public String getVlrDocumento() {
        return vlrDocumento;
    }

    public void setVlrDocumento(String vlrDocumento) {
        this.vlrDocumento = vlrDocumento;
    }

    public String getVlrGlosa() {
        return vlrGlosa;
    }

    public void setVlrGlosa(String vlrGlosa) {
        this.vlrGlosa = vlrGlosa;
    }

    public String getVlrLiquido() {
        return vlrLiquido;
    }

    public void setVlrLiquido(String vlrLiquido) {
        this.vlrLiquido = vlrLiquido;
    }

    public Long getNumMes() {
        return numMes;
    }

    public void setNumMes(Long numMes) {
        this.numMes = numMes;
    }

    public Long getNumAno() {
        return numAno;
    }

    public void setNumAno(Long numAno) {
        this.numAno = numAno;
    }

    public Long getNumParcela() {
        return numParcela;
    }

    public void setNumParcela(Long numParcela) {
        this.numParcela = numParcela;
    }

    public String getTxtPassageiro() {
        return txtPassageiro;
    }

    public void setTxtPassageiro(String txtPassageiro) {
        this.txtPassageiro = txtPassageiro;
    }

    public String getTxtTrecho() {
        return txtTrecho;
    }

    public void setTxtTrecho(String txtTrecho) {
        this.txtTrecho = txtTrecho;
    }

    public Long getNumLote() {
        return numLote;
    }

    public void setNumLote(Long numLote) {
        this.numLote = numLote;
    }

    public Long getNumRessarcimento() {
        return numRessarcimento;
    }

    public void setNumRessarcimento(Long numRessarcimento) {
        this.numRessarcimento = numRessarcimento;
    }

    public String getVlrRestituicao() {
        return vlrRestituicao;
    }

    public void setVlrRestituicao(String vlrRestituicao) {
        this.vlrRestituicao = vlrRestituicao;
    }

    public Long getNuDeputadoId() {
        return nuDeputadoId;
    }

    public void setNuDeputadoId(Long nuDeputadoId) {
        this.nuDeputadoId = nuDeputadoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DespesaParser despesaParser = (DespesaParser) o;

        if (txNomeParlamentar != null ? !txNomeParlamentar.equals(despesaParser.txNomeParlamentar) : despesaParser.txNomeParlamentar != null)
            return false;
        if (ideCadastro != null ? !ideCadastro.equals(despesaParser.ideCadastro) : despesaParser.ideCadastro != null) return false;
        if (nuCarteiraParlamentar != null ? !nuCarteiraParlamentar.equals(despesaParser.nuCarteiraParlamentar) : despesaParser.nuCarteiraParlamentar != null)
            return false;
        if (nuLegislatura != null ? !nuLegislatura.equals(despesaParser.nuLegislatura) : despesaParser.nuLegislatura != null)
            return false;
        if (sgUF != null ? !sgUF.equals(despesaParser.sgUF) : despesaParser.sgUF != null) return false;
        if (sgPartido != null ? !sgPartido.equals(despesaParser.sgPartido) : despesaParser.sgPartido != null) return false;
        if (codLegislatura != null ? !codLegislatura.equals(despesaParser.codLegislatura) : despesaParser.codLegislatura != null)
            return false;
        if (numSubCota != null ? !numSubCota.equals(despesaParser.numSubCota) : despesaParser.numSubCota != null) return false;
        if (txtDescricao != null ? !txtDescricao.equals(despesaParser.txtDescricao) : despesaParser.txtDescricao != null)
            return false;
        if (numEspecificacaoSubCota != null ? !numEspecificacaoSubCota.equals(despesaParser.numEspecificacaoSubCota) : despesaParser.numEspecificacaoSubCota != null)
            return false;
        if (txtDescricaoEspecificacao != null ? !txtDescricaoEspecificacao.equals(despesaParser.txtDescricaoEspecificacao) : despesaParser.txtDescricaoEspecificacao != null)
            return false;
        if (txtFornecedor != null ? !txtFornecedor.equals(despesaParser.txtFornecedor) : despesaParser.txtFornecedor != null)
            return false;
        if (txtCNPJCPF != null ? !txtCNPJCPF.equals(despesaParser.txtCNPJCPF) : despesaParser.txtCNPJCPF != null) return false;
        if (txtNumero != null ? !txtNumero.equals(despesaParser.txtNumero) : despesaParser.txtNumero != null) return false;
        if (indTipoDocumento != null ? !indTipoDocumento.equals(despesaParser.indTipoDocumento) : despesaParser.indTipoDocumento != null)
            return false;
        if (datEmissao != null ? !datEmissao.equals(despesaParser.datEmissao) : despesaParser.datEmissao != null) return false;
        if (vlrDocumento != null ? !vlrDocumento.equals(despesaParser.vlrDocumento) : despesaParser.vlrDocumento != null)
            return false;
        if (vlrGlosa != null ? !vlrGlosa.equals(despesaParser.vlrGlosa) : despesaParser.vlrGlosa != null) return false;
        if (vlrLiquido != null ? !vlrLiquido.equals(despesaParser.vlrLiquido) : despesaParser.vlrLiquido != null) return false;
        if (numMes != null ? !numMes.equals(despesaParser.numMes) : despesaParser.numMes != null) return false;
        if (numAno != null ? !numAno.equals(despesaParser.numAno) : despesaParser.numAno != null) return false;
        if (numParcela != null ? !numParcela.equals(despesaParser.numParcela) : despesaParser.numParcela != null) return false;
        if (txtPassageiro != null ? !txtPassageiro.equals(despesaParser.txtPassageiro) : despesaParser.txtPassageiro != null)
            return false;
        if (txtTrecho != null ? !txtTrecho.equals(despesaParser.txtTrecho) : despesaParser.txtTrecho != null) return false;
        if (numLote != null ? !numLote.equals(despesaParser.numLote) : despesaParser.numLote != null) return false;
        if (numRessarcimento != null ? !numRessarcimento.equals(despesaParser.numRessarcimento) : despesaParser.numRessarcimento != null)
            return false;
        if (vlrRestituicao != null ? !vlrRestituicao.equals(despesaParser.vlrRestituicao) : despesaParser.vlrRestituicao != null)
            return false;
        return !(nuDeputadoId != null ? !nuDeputadoId.equals(despesaParser.nuDeputadoId) : despesaParser.nuDeputadoId != null);

    }

    @Override
    public int hashCode() {
        int result = txNomeParlamentar != null ? txNomeParlamentar.hashCode() : 0;
        result = 31 * result + (ideCadastro != null ? ideCadastro.hashCode() : 0);
        result = 31 * result + (nuCarteiraParlamentar != null ? nuCarteiraParlamentar.hashCode() : 0);
        result = 31 * result + (nuLegislatura != null ? nuLegislatura.hashCode() : 0);
        result = 31 * result + (sgUF != null ? sgUF.hashCode() : 0);
        result = 31 * result + (sgPartido != null ? sgPartido.hashCode() : 0);
        result = 31 * result + (codLegislatura != null ? codLegislatura.hashCode() : 0);
        result = 31 * result + (numSubCota != null ? numSubCota.hashCode() : 0);
        result = 31 * result + (txtDescricao != null ? txtDescricao.hashCode() : 0);
        result = 31 * result + (numEspecificacaoSubCota != null ? numEspecificacaoSubCota.hashCode() : 0);
        result = 31 * result + (txtDescricaoEspecificacao != null ? txtDescricaoEspecificacao.hashCode() : 0);
        result = 31 * result + (txtFornecedor != null ? txtFornecedor.hashCode() : 0);
        result = 31 * result + (txtCNPJCPF != null ? txtCNPJCPF.hashCode() : 0);
        result = 31 * result + (txtNumero != null ? txtNumero.hashCode() : 0);
        result = 31 * result + (indTipoDocumento != null ? indTipoDocumento.hashCode() : 0);
        result = 31 * result + (datEmissao != null ? datEmissao.hashCode() : 0);
        result = 31 * result + (vlrDocumento != null ? vlrDocumento.hashCode() : 0);
        result = 31 * result + (vlrGlosa != null ? vlrGlosa.hashCode() : 0);
        result = 31 * result + (vlrLiquido != null ? vlrLiquido.hashCode() : 0);
        result = 31 * result + (numMes != null ? numMes.hashCode() : 0);
        result = 31 * result + (numAno != null ? numAno.hashCode() : 0);
        result = 31 * result + (numParcela != null ? numParcela.hashCode() : 0);
        result = 31 * result + (txtPassageiro != null ? txtPassageiro.hashCode() : 0);
        result = 31 * result + (txtTrecho != null ? txtTrecho.hashCode() : 0);
        result = 31 * result + (numLote != null ? numLote.hashCode() : 0);
        result = 31 * result + (numRessarcimento != null ? numRessarcimento.hashCode() : 0);
        result = 31 * result + (vlrRestituicao != null ? vlrRestituicao.hashCode() : 0);
        result = 31 * result + (nuDeputadoId != null ? nuDeputadoId.hashCode() : 0);
        return result;
    }
}
