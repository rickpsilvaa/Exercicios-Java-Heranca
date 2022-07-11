package ex3;

public class Velho extends Comprar{

	public Velho(double preco, String cidade) {
		super(preco, cidade);
	}

	public double comprarVelho() {
		return this.getPreco() * 0.8;
	}
	
	public void Imprime() {
		super.imprime();
		System.out.println("O valor de compra de uma "
				+ "casa velha é: R$ "+comprarVelho());
	}

}
