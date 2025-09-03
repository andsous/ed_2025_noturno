package exercicio5;

public class ProdutoNacional extends Produto {

	String fabricante;

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public double calcularPrecoFinal() {
		return getPrecoBase();
	}

}
