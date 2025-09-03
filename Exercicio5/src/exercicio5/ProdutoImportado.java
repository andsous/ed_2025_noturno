package exercicio5;

public class ProdutoImportado extends Produto {

	String paisOrigem;

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}

	@Override
	public double calcularPrecoFinal() {
		
		return getPrecoBase() + (getPrecoBase() * 0.15);
	}
	
}
