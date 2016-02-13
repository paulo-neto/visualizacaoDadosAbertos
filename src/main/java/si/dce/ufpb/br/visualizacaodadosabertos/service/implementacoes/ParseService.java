package si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.ServletRequestUtils;
import si.dce.ufpb.br.visualizacaodadosabertos.modelo.Orgao;
import si.dce.ufpb.br.visualizacaodadosabertos.service.interfaces.IParseService;
import si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes.VisualizacaoDadosAbertosException;

import javax.servlet.ServletContext;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by paulo on 09/02/16.
 */
@Service
public class ParseService implements IParseService<Orgao>  {

    private String pastaDadosXml = "/dadosXml/";


    @Override
    public Orgao lerXml(String nomeArquivo) throws VisualizacaoDadosAbertosException {
        FileReader reader = null;
        Orgao orgao = null;

        //TODO CONTINUAR AQUI
        /*ServletContext scontext = (ServletContext) ServletRequestUtils.get*/
                //.getExternalContext().getContext();


        try {
            //carrega o arquivo XML para um objeto reader
            reader = new FileReader(nomeArquivo);
            XStream xStream = new XStream(new DomDriver());
            xStream.processAnnotations(Orgao.class);

            orgao = (Orgao) xStream.fromXML(reader);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            return orgao;
        }
    }
}
