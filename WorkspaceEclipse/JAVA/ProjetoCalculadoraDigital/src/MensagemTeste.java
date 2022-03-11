import static org.junit.Assert.*;

import org.junit.Test;

public class MensagemTeste {

	@Test
	public void testeMensagemCerta() {
		MensagemPadrao mensagem = new MensagemPadrao();
		String mensagemEsperada = "Bem vindos, todos vocês";
		String mensagemRetornada = mensagem.gerarMensagem();
		assertEquals(mensagemEsperada, mensagemRetornada);
	}

}
