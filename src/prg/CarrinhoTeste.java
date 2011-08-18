package prg;
import org.junit.Assert;
import org.junit.Test;

public class CarrinhoTeste {

	@Test
	public void oMenorProdutoDeUmCarrinho() {
		Carrinho c = new Carrinho();
		c.adicionaProduto("Tereré", 2.3);
		c.adicionaProduto("Banana", 5);
		c.adicionaProduto("Coxão Mole", 14.9);
		c.adicionaProduto("Cerveja Skol", 2.6);
		c.adicionaProduto("Sobá", 9.90);
		
		Assert.assertEquals(2.3, c.getMenorValor(), 0.00001);			
		
	}

}
