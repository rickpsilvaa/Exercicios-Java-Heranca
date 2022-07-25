package ex5;

import java.util.Scanner;

public class CD extends Midia{

	private int musicas;
	
	public CD() {
		super();
	}
	
	public CD(int codigo, double preco, String nome, int musicas) {
		super(codigo, preco, nome);
		this.musicas = musicas;
	}
	
	public String getTipo() {
		return "CD : ";
	}
	
	public String getDetalges() {
		return super.getDetalhes() + "\n"
				+ "N�mero de m�sicas: " +musicas;
	}
	
	public void setMusicas(int mus) {
		musicas = (mus > 0) ? mus : 0;
	}
	
	//fun��o para leitura dos dados pelo teclado
	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o n�mero de musicas: ");
		int mus = sc.nextInt();
		
		setMusicas(mus);
	}

}
