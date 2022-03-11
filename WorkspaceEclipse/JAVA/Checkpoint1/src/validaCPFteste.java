import static org.junit.Assert.*;

import org.junit.Test;

public class validaCPFteste {

	//Teste validarCPF
	@Test
	public void validaCPF1() {
		CodigoPessoaFisica cpf = new CodigoPessoaFisica();
		assertEquals(false, cpf.validaCPF("111444777-05"));
		
	}
	
	@Test
	public void validaCPF2() {
		CodigoPessoaFisica cpf = new CodigoPessoaFisica();
		assertEquals(true, cpf.validaCPF("11144477735"));
		
	}
	
	//Teste removeCaracteresEspeciais
		@Test
		public void removeCaracteresEspeciais() {
			String cpf = "111.444.777-05";
			String resultadoEsperado = "11144477705";
			CodigoPessoaFisica doc = new CodigoPessoaFisica();
			String resultado = doc.removeCaracteresEspeciais(cpf); 
			assertEquals(resultadoEsperado, resultado);
			
		}
	
	
}
