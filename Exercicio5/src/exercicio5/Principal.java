package exercicio5;

public class Principal {
	
	
	public static void main(String[] args) {
		
		ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel(); 
		produtoPerecivel.setNome("Queijo");
		produtoPerecivel.setCodigoBarras("31");
		produtoPerecivel.setPrecoBase(40.00);
		produtoPerecivel.setCategoria("Laticinios");
		produtoPerecivel.setDataValidade("10/10/2025");
		double calculoPerecivel = produtoPerecivel.calcularPrecoFinal();
		
		
		ProdutoImportado produtoImportado = new ProdutoImportado(); 
		produtoImportado.setNome("Whisky");
		produtoImportado.setCodigoBarras("07898945131155 ");
		produtoImportado.setPrecoBase(159.99);
		produtoImportado.setCategoria("adega");
		produtoImportado.setPaisOrigem("Inglaterra");
		double calculoImportado = produtoPerecivel.calcularPrecoFinal();
		
		ProdutoNacional produtoNacional = new ProdutoNacional(); 
		produtoNacional.setNome("Pequi do Goias");
		produtoNacional.setCodigoBarras("11");
		produtoNacional.setPrecoBase(10.00);
		produtoNacional.setCategoria("hortifruti");
		produtoNacional.setFabricante("Serjao berranteiro");
		double calculoNacional = produtoNacional.calcularPrecoFinal();
		
		
		System.out.println("PRODUTO PERECIVEL");
		System.out.println(produtoPerecivel.getNome());
		System.out.println(produtoPerecivel.getCodigoBarras());
		System.out.println(produtoPerecivel.getCategoria());
		System.out.println(produtoPerecivel.getDataValidade());
		System.out.println(calculoPerecivel);
		System.out.println("--------------------------------");
		
		
		System.out.println("PRODUTO IMPORTADO");
		System.out.println(produtoImportado.getNome());
		System.out.println(produtoImportado.getCodigoBarras());
		System.out.println(produtoImportado.getCategoria());
		System.out.println(produtoImportado.getPaisOrigem());
		System.out.println(calculoImportado);
		System.out.println("--------------------------------");
		
		System.out.println("PRODUTO NACIONAL");
		System.out.println(produtoNacional.getNome());
		System.out.println(produtoNacional.getCodigoBarras());
		System.out.println(produtoNacional.getCategoria());
		System.out.println(produtoNacional.getFabricante());
		System.out.println(calculoNacional);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
