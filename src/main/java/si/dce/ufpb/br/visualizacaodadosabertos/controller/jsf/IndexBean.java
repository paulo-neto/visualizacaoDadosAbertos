package si.dce.ufpb.br.visualizacaodadosabertos.controller.jsf;

import java.io.Serializable;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.primefaces.model.chart.BubbleChartModel;
import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.DonutChartModel;
import org.primefaces.model.chart.PieChartModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes.OrgaoService;

@Controller(value="indexBean")
@Scope("view")
public class IndexBean implements Serializable {

	private static final String LINK_PORTAL = "http://www2.camara.leg.br/transparencia/cota-para-exercicio-da-atividade-parlamentar/dados-abertos-cota-parlamentar";
	private static final String LINK_ARQUIVO_ANO_ATUAL = LINK_PORTAL;
	
	private PieChartModel topDezGastosPorPartido;
	private CartesianChartModel topDezTotalGastosPorparlamentar;
	private CartesianChartModel topCincoGastosTelefoniaPB;
	private PieChartModel tiposDespesas;
	private BigDecimal totalTopCincoTelefonia;
	
	@Autowired
	private OrgaoService orgaoService;
	
	@PostConstruct
	public void init(){
		topDezGastosPorPartido = new PieChartModel();
		topDezTotalGastosPorparlamentar = new CartesianChartModel();
		topCincoGastosTelefoniaPB = new CartesianChartModel();
		tiposDespesas = new PieChartModel();
		criarGraficoTotalGastoPorPartido(topDezGastosPorPartido, orgaoService.getTotalGastoPorPartido());
		criarTopQuinzeTotalGastosPorparlamentar(topDezTotalGastosPorparlamentar,orgaoService.getTotalGastoPorParlamentar());
		criarGastosTelefonia(topCincoGastosTelefoniaPB,orgaoService.getTotalGastosTelefoniaPorEstadoEparlamentar("PB"));
		criarGraficoTiposDespesas(tiposDespesas,orgaoService.getTotalDespesasPorTipo());
	}
	
	private void criarGraficoTiposDespesas(PieChartModel tiposDespesas,
			Map<String, Number> totalDespesasPorTipo) {
		
		List<String> despesas = new ArrayList<String>(totalDespesasPorTipo.keySet());
		Collections.sort(despesas);
		Collections.reverse(despesas);
		for(String des: despesas){
			if(totalDespesasPorTipo.get(des) != null){
				tiposDespesas.set(des,totalDespesasPorTipo.get(des));
			}
			
		}
	}

	private void criarGastosTelefonia(CartesianChartModel topCincoTipoGastos,
			Map<String,BigDecimal> totalGastosTelefoniaPorEstado) {
		
		List<String> despesas = new ArrayList<String>(totalGastosTelefoniaPorEstado.keySet());
		Collections.sort(despesas);
		ChartSeries series;
		totalTopCincoTelefonia = new BigDecimal(0);
		for(String valor: despesas){
			series = new ChartSeries();
			BigDecimal vl = totalGastosTelefoniaPorEstado.get(valor);
			series.set(" ", vl.doubleValue());
			series.setLabel(valor);
			topCincoGastosTelefoniaPB.addSeries(series);
			totalTopCincoTelefonia = totalTopCincoTelefonia.add(vl);
		}
		
		
	}

	private void criarTopQuinzeTotalGastosPorparlamentar(
			CartesianChartModel topDezTotalGastosPorparlamentar,
			Map<BigDecimal, String> totalGastoPorParlamentar) {
		
		List<BigDecimal> despesas = new ArrayList<BigDecimal>(totalGastoPorParlamentar.keySet());
		Collections.sort(despesas);
		//Collections.reverse(despesas);
		despesas = despesas.subList(0, 15);
		ChartSeries series;
		String nome = null;
		String nomeReduzido = null;
		for(BigDecimal valor: despesas){
			series = new ChartSeries();
			nome = "";
			nomeReduzido = "";
			nome = totalGastoPorParlamentar.get(valor);
			if(nome != null && nome.length() >= 15){
				nomeReduzido = nome.substring(0, 15);
			}else{
				nomeReduzido = nome;
			}
			BigDecimal vl = valor.setScale(0, BigDecimal.ROUND_HALF_EVEN);
			series.set(" ", vl.doubleValue());
			series.setLabel(nomeReduzido);
			topDezTotalGastosPorparlamentar.addSeries(series);
		}
	}

	private void criarGraficoTotalGastoPorPartido(PieChartModel pieChart,Map<BigDecimal,String> map){
		List<BigDecimal> despesas = new ArrayList<BigDecimal>(map.keySet());
		Collections.sort(despesas);
		Collections.reverse(despesas);
		for(BigDecimal valor: despesas){
			if(map.get(valor) != null){
				pieChart.set(map.get(valor),valor);
			}
			
		}
	}

	/**
	 * @return the topDezGastosPorPartido
	 */
	public PieChartModel getTopDezGastosPorPartido() {
		return topDezGastosPorPartido;
	}

	/**
	 * @param topDezGastosPorPartido the topDezGastosPorPartido to set
	 */
	public void setTopDezGastosPorPartido(PieChartModel topDezGastosPorPartido) {
		this.topDezGastosPorPartido = topDezGastosPorPartido;
	}

	/**
	 * @return the topDezTotalGastosPorparlamentar
	 */
	public CartesianChartModel getTopDezTotalGastosPorparlamentar() {
		return topDezTotalGastosPorparlamentar;
	}

	/**
	 * @param topDezTotalGastosPorparlamentar the topDezTotalGastosPorparlamentar to set
	 */
	public void setTopDezTotalGastosPorparlamentar(
			CartesianChartModel topDezTotalGastosPorparlamentar) {
		this.topDezTotalGastosPorparlamentar = topDezTotalGastosPorparlamentar;
	}
	
	public String getDatatipFormatIntegers(){  
        return "<span style=\"display:none;\">%s</span>R$ <span>%s</span>";  
     } 
	
	/**
	 * @return the topCincoGastosTelefoniaPB
	 */
	public CartesianChartModel getTopCincoGastosTelefoniaPB() {
		return topCincoGastosTelefoniaPB;
	}

	/**
	 * @param topCincoGastosTelefoniaPB the topCincoGastosTelefoniaPB to set
	 */
	public void setTopCincoGastosTelefoniaPB(CartesianChartModel topCincoGastosTelefoniaPB) {
		this.topCincoGastosTelefoniaPB = topCincoGastosTelefoniaPB;
	}

	/**
	 * @return the totalTopCincoTelefonia
	 */
	public BigDecimal getTotalTopCincoTelefonia() {
		return totalTopCincoTelefonia;
	}

	/**
	 * @param totalTopCincoTelefonia the totalTopCincoTelefonia to set
	 */
	public void setTotalTopCincoTelefonia(BigDecimal totalTopCincoTelefonia) {
		this.totalTopCincoTelefonia = totalTopCincoTelefonia;
	}
	
	/**
	 * @return the tiposDespesas
	 */
	public PieChartModel getTiposDespesas() {
		return tiposDespesas;
	}

	/**
	 * @param tiposDespesas the tiposDespesas to set
	 */
	public void setTiposDespesas(PieChartModel tiposDespesas) {
		this.tiposDespesas = tiposDespesas;
	}

	public String getAnoAtual(){
		Date d = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		return calendar.get(Calendar.YEAR)+"";
	}
	
	public String getLinkArquivoAnoAtual(){
		return LINK_ARQUIVO_ANO_ATUAL;
	}
	
	
	public String getLinkPortal(){
		return LINK_PORTAL;
	}
	
	public String getDataAtualizacaoArquivo(){
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy");
		return sdf.format(orgaoService.getOrgao().getDataAtualizacao() != null ? orgaoService.getOrgao().getDataAtualizacao() : new Date());
	}
}
