package si.dce.ufpb.br.visualizacaodadosabertos.util.excecoes;

/**
 * Created by paulo on 09/02/16.
 */
public class VisualizacaoDadosAbertosException extends Exception{

    public VisualizacaoDadosAbertosException() {
    }

    public VisualizacaoDadosAbertosException(String message) {
        super(message);
    }

    public VisualizacaoDadosAbertosException(String message, Throwable cause) {
        super(message, cause);
    }

    public VisualizacaoDadosAbertosException(Throwable cause) {
        super(cause);
    }

    public VisualizacaoDadosAbertosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
