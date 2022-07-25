package ex6;

import java.util.Scanner;

public class MP3 extends Arquivo{
	
	private int downloads;
	
	public MP3() {
		super();
	}
	
	public MP3(int bytes, double preco, String autor, int downloads) {
		super(bytes, preco, autor);
		this.downloads = downloads;
	}
	
	public String getTipo() {
		return "MP3: ";
	}
	
	public String getDetalhes() {
		return super.getDetalhes() + "\n"
				+ "numero de downloads: " + downloads;
	}
	
	public void setDownloads( int down) {
		downloads = down;
	}
	
	public void inserirDados() {
		
		super.inserirDados();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Número de downloads: ");
		int down = sc.nextInt();
		
		setDownloads(down);
	}

}
