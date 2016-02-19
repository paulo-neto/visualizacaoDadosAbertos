package si.dce.ufpb.br.visualizacaodadosabertos.util.serializer;

import java.io.IOException;
import java.math.BigDecimal;

import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;

public class MonetarioSerializer extends JsonSerializer<BigDecimal> {

	@Override
	public void serialize(BigDecimal value, JsonGenerator jgen,
			SerializerProvider arg2) throws IOException,
			JsonProcessingException {
        jgen.writeString(value.setScale(2, BigDecimal.ROUND_HALF_UP).toString());
	}

}
