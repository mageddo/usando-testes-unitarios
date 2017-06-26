import org.junit.Assert;
import org.junit.Test;

/**
 * Created by elvis on 25/06/17.
 */
public class PalavraUtilsTest {

	@Test
	public void testContarPalavrasTextoNenhumaPalavraSucesso(){

		final String texto = "";
		int palavras = PalavraUtils.contarPalavras(texto);
		Assert.assertEquals(0, palavras);

	}

	@Test
	public void testContarPalavrasTextoUmaPalavraSucesso(){

		final String texto = "Abacaxi";
		int palavras = PalavraUtils.contarPalavras(texto);
		Assert.assertEquals(1, palavras);

	}

	@Test
	public void testContarPalavrasTextoDuasPalavrasSucesso(){

		final String texto = "Abacaxi Mamão";
		int palavras = PalavraUtils.contarPalavras(texto);
		Assert.assertEquals(2, palavras);

	}


	@Test
	public void testContarPalavrasTextoDuasPalavrasDoisEspacosSeguidosSucesso(){

		final String texto = "Abacaxi  Mamão";
		int palavras = PalavraUtils.contarPalavras(texto);
		Assert.assertEquals(2, palavras);

	}

	@Test
	public void testContarPalavrasTextoTresPalavrassPalavrasDoisEspacosSeguidosSucesso(){

		final String texto = "Abacaxi  Mamão Uva  ";
		int palavras = PalavraUtils.contarPalavras(texto);
		Assert.assertEquals(3, palavras);

	}

	@Test
	public void testContarPalavrasTextoNenhumaPalavraUmEspacoSucesso(){

		final String texto = "  ";
		int palavras = PalavraUtils.contarPalavras(texto);
		Assert.assertEquals(0, palavras);

	}

	@Test(expected = NullPointerException.class)
	public void testContarPalavrasTextoPalavraNulaErro(){

		final String texto = null;
		int palavras = PalavraUtils.contarPalavras(texto);
		Assert.assertEquals(0, palavras);

	}
}
