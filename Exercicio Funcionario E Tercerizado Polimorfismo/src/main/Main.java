package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTercerizado;

public class Main {

	public static void main(String[] args) {
		
		/* O programa recebe informações de funcionários tercerizados e comuns */
		/* Calcula o pagamento de forma diferente se o funcionário é comum ou tercerizado */
		/* Exercício em java para treinamento de herança. polimorfismo e conceitos básicos */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		System.out.println("Digite o número de funcionários: ");
		int nFuncionarios = sc.nextInt();
		
		for(int i=0;i<nFuncionarios;i++) {
			System.out.println("Dados do funcionário #"+i+": ");
			System.out.println("O funcionário é tercerizado (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			if(ch == 'y') {
				System.out.println("Taxa adicional: ");
				double taxaAdicional = sc.nextDouble();
				Funcionario func = new FuncionarioTercerizado(nome, horas, valorPorHora, taxaAdicional);
				funcionarios.add(func);
			}else {
				Funcionario func = new Funcionario(nome, horas, valorPorHora);
				funcionarios.add(func);
			}
		}
		
		System.out.println("Pagamentos: ");
		for (Funcionario func: funcionarios) {
			System.out.println(func.getNome() + " - $"+String.format("%.2f", func.Pagamento()));
		}
		
		sc.close();

	}

}
