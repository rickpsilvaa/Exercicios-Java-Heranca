package ex7;

import java.util.Scanner;

public class Assalariado extends Funcionario{
	
	private double salario;
	
	public Assalariado() {
		
	}
	
	public Assalariado(String nome, double salario) {
		super(nome);
		this.salario = salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getPagamento(double sal) {
		this.salario = sal;
		return salario;
	}

	public void inserirDados() {
		super.inserirDados();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Inforeme o salario: ");
		double sal = sc.nextDouble();
		
		setSalario(sal);
	}

}
