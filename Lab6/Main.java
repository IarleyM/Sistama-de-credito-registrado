package Lab6;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		Loja l= new Loja();
		
		long id = 0;
		String nome;
		int idade;
		String cpf;
		
			System.out.println("---Cadastro de clientes---");
			
			id = random.nextLong();
			
			System.out.print("Nome completo: ");
			nome = sc.nextLine();
			
			System.out.print("Idade: ");
			idade = sc.nextInt();
			
			System.out.print("CPF: ");
			cpf = sc.next();
			sc.close();
			
			l.adicionaCliente(id, nome, idade, cpf);
			
			
			
			
	}
}
