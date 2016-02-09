package si.dce.ufpb.br.visualizacaodadosabertos.modelo;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.math.BigDecimal;

/**
 * Created by paulo on 09/02/16.
 */
@XStreamAlias("despesa")
public class Despesa {

    /**
     * Nome adotado pelo Parlamentar ao tomar posse do seu mandato. Compõe-se de dois elementos: um prenome e o nome;
     * dois nomes; ou dois prenomes, salvo, a juízo do Presidente da Casa legislativa, que poderá alterar essa regra
     * para que não ocorram confusões.
     */
    private String txNomeParlamentar;

    /**
     * Número que identifica unicamente um deputado federal na CD.
     */
    private Long ideCadastro;

    /**
     * Documento usado para identificar um deputado federal na CD. Pode alterar a cada Legislatura nova.
     */
    private Long nuCarteiraParlamentar;

    /**
     * Legislatura: Período de quatro anos coincidente com o mandato parlamentar dos Deputados Federais. No contexto da
     * cota CEAP, representa o ano base de início da legislatura e é utilizado para compor a Carteira Parlamentar, pois
     * esta poderá ser alterada à medida que se muda de Legislatura.
     */
    private Long nuLegislatura;

    /**
     * No contexto da cota CEAP, representa a unidade da federação pela qual o deputado foi eleito e é utilizada para
     * definir o valor da cota a que o deputado tem.
     */
    private String sgUF;

    /**
     * O seu conteúdo representa a sigla de um partido. Definição de partido: é uma organização formada por pessoas com
     * interesse ou ideologia comuns, que se associam com o fim de assumir o poder para implantar um programa de governo.
     * Tem personalidade jurídica de direito privado e goza de autonomia e liberdade no que diz respeito à criação,
     * organização e funcionamento, observados os princípios e preceitos constitucionais.
     */
    private String sgPartido;

    /**
     * Legislatura: Período de quatro anos coincidente com o mandato parlamentar dos Deputados Federais. No contexto da
     * cota CEAP, o seu conteúdo representa o código identificador da Legislatura, que um número ordinal sequencial,
     * alterado de um em um, a cada início de uma nova Legislatura (por exemplo, a Legislatura que iniciou em 2011 é a
     * 54ª Legislatura).
     */
    private Long codLegislatura;

    /**
     * No contexto da Cota CEAP, o conteúdo deste dado representa o código do Tipo de Despesa referente à despesa
     * realizada pelo deputado e comprovada por meio da emissão de um documento fiscal, a qual é debitada na cota do
     * deputado.
     */
    private Long numSubCota;

    /**
     * O seu conteúdo é a descrição do Tipo de Despesa relativo à despesa em questão.
     */
    private String txtDescricao;

    /**
     * No contexto da Cota CEAP, há despesas cujo Tipo de Despesa necessita ter uma especificação mais detalhada
     * (por exemplo, ?Combustível?). O conteúdo deste dado representa o código desta especificação mais detalhada.
     */
    private Long numEspecificacaoSubCota;

    /**
     * Representa a descrição  especificação mais detalhada de um referido Tipo de Despesa.
     */
    private String txtDescricaoEspecificacao;

    /**
     * O conteúdo deste dado representa o nome do fornecedor do produto ou serviço presente no documento fiscal
     */
    private String txtFornecedor;

    /**
     * O conteúdo deste dado representa o CNPJ ou o CPF do emitente do documento fiscal, quando se tratar do uso da cota
     * em razão do reembolso despesas comprovadas pela emissão de documentos fiscais.
     */
    private String txtCNPJCPF;

    /**
     * O conteúdo deste dado representa o número de face do documento fiscal emitido ou o número do documento que deu
     * causa à despesa debitada na cota do deputado.
     */
    private String txtNumero;

    /**
     * Este dado representa o tipo de documento do fiscal ? 0 (Zero), para Nota Fiscal; 1 (um), para Recibo; e 2, para
     * Despesa no Exterior.
     */
    private Long indTipoDocumento;

    /**
     * O conteúdo deste dado é a data de emissão do documento fiscal ou a data do documento que tenha dado causa à despesa.
     */
    private String datEmissao;

    /**
     * O seu conteúdo é o valor de face do documento fiscal ou o valor do documento que deu causa à despesa. Quando se
     * tratar de bilhete aéreo, esse valor poderá ser negativo, significando que o referido bilhete é um bilhete de
     * compensação, pois compensa um outro bilhete emitido e não utilizado pelo deputado (idem para o dado vlrLiquido abaixo).
     */
    private String vlrDocumento;

    /**
     * O seu conteúdo representa o valor da glosa do documento fiscal que incidirá sobre o Valor do Documento, ou o
     * valor da glosa do documento que deu causa à despesa.
     */
    private String vlrGlosa;

    /**
     * O seu conteúdo representa o valor líquido do documento fiscal ou do documento que deu causa à despesa e será
     * calculado pela diferença entre o Valor do Documento e o Valor da Glosa. É este valor que será debitado da cota do
     * deputado. Caso o débito seja do Tipo Telefonia e o valor seja igual a zero, significa que a despesa foi franqueada.
     */
    private String vlrLiquido;

    /**
     * O seu conteúdo representa o Mês da competência financeira do documento fiscal ou do documento que deu causa à despesa.
     * É utilizado, junto com o ano, para determinar em que período o débito gerará efeito financeiro sobre a cota.
     */
    private Long numMes;

    /**
     * O seu conteúdo representa o Ano da competência financeira do documento fiscal ou do documento que deu causa à despesa.
     * É utilizado, junto com o mês, para determinar em que período o débito gerará efeito financeiro sobre a cota.
     */
    private Long numAno;

    /**
     * O seu conteúdo representa o número da parcela do documento fiscal. Ocorre quando o documento tem de ser reembolsado
     * de forma parcelada.
     */
    private Long numParcela;

    /**
     * O conteúdo deste dado representa o nome do passageiro, quando o documento que deu causa à despesa se tratar de
     * emissão de bilhete aéreo.
     */
    private String txtPassageiro;

    /**
     * O conteúdo deste dado representa o trecho da viagem, quando o documento que deu causa à despesa se tratar de
     * emissão de bilhete aéreo.
     */
    private String txtTrecho;

    /**
     * No contexto da Cota CEAP, o Número do Lote representa uma capa de lote que agrupa os documentos que serão
     * entregues à Câmara para serem ressarcidos. Este dado, juntamente com o Número do Ressarcimento, auxilia a
     * localização do documento no Arquivo da Casa.
     */
    private Long numLote;

    /**
     * No contexto da Cota CEAP, o Número do Ressarcimento indica o ressarcimento do qual o documento fez parte por
     * ocasião do processamento do seu reembolso. Este dado, juntamente com o Número do Ressarcimento, auxilia a
     * localização do documento no Arquivo da Casa.
     */
    private Long numRessarcimento;

    /**
     * O seu conteúdo representa o valor restituído do documento fiscal que incidirá sobre o Valor do Documento.
     */
    private String vlrRestituicao;

    /**
     * Número que identifica um Parlamentar ou Liderança na Transparência da Cota para Exercício da Atividade Parlamentar.
     */
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

        Despesa despesa = (Despesa) o;

        if (txNomeParlamentar != null ? !txNomeParlamentar.equals(despesa.txNomeParlamentar) : despesa.txNomeParlamentar != null)
            return false;
        if (ideCadastro != null ? !ideCadastro.equals(despesa.ideCadastro) : despesa.ideCadastro != null) return false;
        if (nuCarteiraParlamentar != null ? !nuCarteiraParlamentar.equals(despesa.nuCarteiraParlamentar) : despesa.nuCarteiraParlamentar != null)
            return false;
        if (nuLegislatura != null ? !nuLegislatura.equals(despesa.nuLegislatura) : despesa.nuLegislatura != null)
            return false;
        if (sgUF != null ? !sgUF.equals(despesa.sgUF) : despesa.sgUF != null) return false;
        if (sgPartido != null ? !sgPartido.equals(despesa.sgPartido) : despesa.sgPartido != null) return false;
        if (codLegislatura != null ? !codLegislatura.equals(despesa.codLegislatura) : despesa.codLegislatura != null)
            return false;
        if (numSubCota != null ? !numSubCota.equals(despesa.numSubCota) : despesa.numSubCota != null) return false;
        if (txtDescricao != null ? !txtDescricao.equals(despesa.txtDescricao) : despesa.txtDescricao != null)
            return false;
        if (numEspecificacaoSubCota != null ? !numEspecificacaoSubCota.equals(despesa.numEspecificacaoSubCota) : despesa.numEspecificacaoSubCota != null)
            return false;
        if (txtDescricaoEspecificacao != null ? !txtDescricaoEspecificacao.equals(despesa.txtDescricaoEspecificacao) : despesa.txtDescricaoEspecificacao != null)
            return false;
        if (txtFornecedor != null ? !txtFornecedor.equals(despesa.txtFornecedor) : despesa.txtFornecedor != null)
            return false;
        if (txtCNPJCPF != null ? !txtCNPJCPF.equals(despesa.txtCNPJCPF) : despesa.txtCNPJCPF != null) return false;
        if (txtNumero != null ? !txtNumero.equals(despesa.txtNumero) : despesa.txtNumero != null) return false;
        if (indTipoDocumento != null ? !indTipoDocumento.equals(despesa.indTipoDocumento) : despesa.indTipoDocumento != null)
            return false;
        if (datEmissao != null ? !datEmissao.equals(despesa.datEmissao) : despesa.datEmissao != null) return false;
        if (vlrDocumento != null ? !vlrDocumento.equals(despesa.vlrDocumento) : despesa.vlrDocumento != null)
            return false;
        if (vlrGlosa != null ? !vlrGlosa.equals(despesa.vlrGlosa) : despesa.vlrGlosa != null) return false;
        if (vlrLiquido != null ? !vlrLiquido.equals(despesa.vlrLiquido) : despesa.vlrLiquido != null) return false;
        if (numMes != null ? !numMes.equals(despesa.numMes) : despesa.numMes != null) return false;
        if (numAno != null ? !numAno.equals(despesa.numAno) : despesa.numAno != null) return false;
        if (numParcela != null ? !numParcela.equals(despesa.numParcela) : despesa.numParcela != null) return false;
        if (txtPassageiro != null ? !txtPassageiro.equals(despesa.txtPassageiro) : despesa.txtPassageiro != null)
            return false;
        if (txtTrecho != null ? !txtTrecho.equals(despesa.txtTrecho) : despesa.txtTrecho != null) return false;
        if (numLote != null ? !numLote.equals(despesa.numLote) : despesa.numLote != null) return false;
        if (numRessarcimento != null ? !numRessarcimento.equals(despesa.numRessarcimento) : despesa.numRessarcimento != null)
            return false;
        if (vlrRestituicao != null ? !vlrRestituicao.equals(despesa.vlrRestituicao) : despesa.vlrRestituicao != null)
            return false;
        return !(nuDeputadoId != null ? !nuDeputadoId.equals(despesa.nuDeputadoId) : despesa.nuDeputadoId != null);

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
