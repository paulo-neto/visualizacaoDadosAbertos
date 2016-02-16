package si.dce.ufpb.br.visualizacaodadosabertos.service.implementacoes;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import org.springframework.stereotype.Service;
import si.dce.ufpb.br.visualizacaodadosabertos.parser.OrgaoParser;
import si.dce.ufpb.br.visualizacaodadosabertos.service.interfaces.IParseService;
import si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes.VisualizacaoDadosAbertosException;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created by paulo on 09/02/16.
 */
@Service
public class ParseService implements IParseService<OrgaoParser>  {

    @Override
    public OrgaoParser lerXml(String nomeArquivo) throws VisualizacaoDadosAbertosException {
        FileReader reader = null;
        OrgaoParser orgaoParser = null;
        try {
            //carrega o arquivo XML para um objeto reader
            reader = new FileReader(nomeArquivo);
            XStream xStream = new XStream(new DomDriver());
            xStream.processAnnotations(OrgaoParser.class);

            orgaoParser = (OrgaoParser) xStream.fromXML(reader);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            return orgaoParser;
        }
    }
}
