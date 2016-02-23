package si.dce.ufpb.br.visualizacaodadosabertos.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class DadosAbertosUtil {

	public <T> List<T> setTolist(Set<T> set){
		return new ArrayList<T>(set); 
	}

	public <T> Set<T> listToSet(List<T> list) {
		return new HashSet<T>(list);
	}
}
