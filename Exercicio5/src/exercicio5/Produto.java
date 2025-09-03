package exercicio5;

public abstract class Produto {
	String nome;
	double precoBase;
	String categoria;
	String codigoBarras;

	public abstract double calcularPrecoFinal();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

}
