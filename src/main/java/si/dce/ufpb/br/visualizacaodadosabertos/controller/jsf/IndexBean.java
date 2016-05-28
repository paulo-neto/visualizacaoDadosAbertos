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
	private PieChartModel topCincoGastosTelefoniaPB;
	private BigDecimal totalTopCincoTelefonia;
	
	@Autowired
	private OrgaoService orgaoService;
	
	@PostConstruct
	public void init(){
		topDezGastosPorPartido = new PieChartModel();
		topDezTotalGastosPorparlamentar = new CartesianChartModel();
		topCincoGastosTelefoniaPB = new PieChartModel();
		criarGraficoTopDezTotalGastoPorPartido(topDezGastosPorPartido, orgaoService.getTotalGastoPorPartido());
		criarTopDezTotalGastosPorparlamentar(topDezTotalGastosPorparlamentar,orgaoService.getTotalGastoPorParlamentar());
		criarTopCincoGastosTelefonia(topCincoGastosTelefoniaPB,orgaoService.getTotalGastosTelefoniaPorEstadoEparlamentar("PB"));
	}
	
	private void criarTopCincoGastosTelefonia(PieChartModel topCincoTipoGastos,
			Map<String,BigDecimal> totalGastosTelefoniaPorEstado) {
		
		List<String> parlamentar = new ArrayList<String>(totalGastosTelefoniaPorEstado.keySet());
		Collections.sort(parlamentar);
		Collections.reverse(parlamentar);
		parlamentar = parlamentar.subList(0, 5);
		totalTopCincoTelefonia = new BigDecimal(0);
		for(String deputado: parlamentar){
			topCincoTipoGastos.set(deputado,totalGastosTelefoniaPorEstado.get(deputado));
			totalTopCincoTelefonia = totalTopCincoTelefonia.add(totalGastosTelefoniaPorEstado.get(deputado));
		}
		
	}

	private void criarTopDezTotalGastosPorparlamentar(
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

	private void criarGraficoTopDezTotalGastoPorPartido(PieChartModel pieChart,Map<BigDecimal,String> map){
		List<BigDecimal> despesas = new ArrayList<BigDecimal>(map.keySet());
		Collections.sort(despesas);
		Collections.reverse(despesas);
		despesas = despesas.subList(0, 11);
		for(BigDecimal valor: despesas){
			pieChart.set(map.get(valor),valor);
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
	public PieChartModel getTopCincoGastosTelefoniaPB() {
		return topCincoGastosTelefoniaPB;
	}

	/**
	 * @param topCincoGastosTelefoniaPB the topCincoGastosTelefoniaPB to set
	 */
	public void setTopCincoGastosTelefoniaPB(PieChartModel topCincoGastosTelefoniaPB) {
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
