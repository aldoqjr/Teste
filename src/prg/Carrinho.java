package prg;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	private List<Produto> lista;

	public Carrinho() {
		lista = new ArrayList<Produto>();
	}

	public void adicionaProduto(String nome, double preco) {
		Produto tmp = new Produto(nome, preco);
		lista.add(tmp);
	}

	public double getMenorValor() {
		double valor = 999999;
		for (Produto p : lista) {
			if (p.getValor() < valor)
				valor = p.getValor();
		}
		return valor;
	}

}
