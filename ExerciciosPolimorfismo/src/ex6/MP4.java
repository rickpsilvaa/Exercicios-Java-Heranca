package ex6;

import java.util.Scanner;

public class MP4 extends Arquivo{

		private int visualizacoes;
		
		public MP4() {
			
		}
		
		public MP4(int bytes, double preco, String autor, int visualizacoes) {
			super(bytes, preco, autor);
			this.visualizacoes = visualizacoes;
		}
		
		public String getTipo() {
			return "MP4...";
		}
		
		public String getDetalhes() {
			return super.getDetalhes() + "\n "
					+ "N�mero de visualiza��es: "
					+  visualizacoes + "\n";
		}
		
		public void setVizualizacoes(int visu) {
			this.visualizacoes = visu;
		}
		
		public void InserirDados() {
			
			super.inserirDados();
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Informe a "
					+"quantidade de "
					+"visualiza��es: ");
			int visu = sc.nextInt();
			
			setVizualizacoes(visu);
		}
	
}
