import static org.junit.Assert.*;

import org.junit.Test;

public class TestadoraCriptografadora {

	@Test
	public void testeConversaoA() {
		Criptografadora cripto = new Criptografadora();
		int valorConvertido = cripto.criptografa('A');
		assertEquals(valorConvertido, 19);
	}
	

	@Test
	public void testeConversaoB() {
		Criptografadora cripto = new Criptografadora();
		int valorConvertido = cripto.criptografa('B');
		assertEquals(valorConvertido, 11);
	}

}
