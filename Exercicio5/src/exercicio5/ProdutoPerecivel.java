package exercicio5;

public class ProdutoPerecivel extends Produto {
	
	String dataValidade;

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public double calcularPrecoFinal() {
		return getPrecoBase() - (getPrecoBase() * 0.20);
	}
	

}
