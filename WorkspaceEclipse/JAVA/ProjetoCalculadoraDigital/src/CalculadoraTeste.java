import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {

	//TESTES DE SOMA
	@Test
	public void TESTESOMAR5COM3() {
		int variavel1 = 5;//inicializando variável 1 da SOMA
		int variavel2 = 3;//inicializando variável 2 da SOMA
		int resultadoEsperado = 8;//recebendo o valor esperado
		Calculadora calc = new Calculadora();//criando objeto do cálculo
		int resultadoReal = calc.somar(variavel1, variavel2);//calcula as variáveis
		assertEquals(resultadoEsperado, resultadoReal);//verifica se os resultados são iguais
	}
	
	@Test
	public void TESTESOMAR5COM6() {
		int variavel1 = 5;
		int variavel2 = 6;
		int resultadoEsperado = 11;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.somar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	
	}
	
	//TESTES DE MULTIPLICAR
	@Test
	public void TESTEMULTIPLICAR5COM3() {
		int variavel1 = 5;
		int variavel2 = 3;
		int resultadoEsperado = 15 ;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.multiplicar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	} 
	
	
	//TESTES DE DIVIDIR
	@Test
	public void TESTESUBTRAIR6COM2() {
		int variavel1 = 6;
		int variavel2 = 2;
		int resultadoEsperado = 4;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.subtrair(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	//TESTES DIVIDIR
	@Test
	public void TESTEDIVIDIR10COM5() {
		int variavel1 = 10;
		int variavel2 = 5;
		int resultadoEsperado = 2;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.dividir(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	
}