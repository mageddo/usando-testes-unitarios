/**
 * Created by elvis on 25/06/17.
 */
public class PalavraUtils {

	public static int contarPalavras(final String texto){
		if(texto.isEmpty()){
			return 0;
		}
		return texto.split(" +").length;
	}
}
