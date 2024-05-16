package main;
import java.time.LocalDate;
import java.util.ArrayList;

import arquivos.*;

public class Main {

	public static void main(String[] args) {
		
		// 1° emprestimo
		ArrayList<Arquivo> arquivos1 = new ArrayList<>();
		arquivos1.add(new Livro(12, "Divina Comédia", 1304));
		arquivos1.add(new Livro(111, "Humilhados e Ofendidos", 1861));
		arquivos1.add(new Tese(1, "Tese de Doutorado não genérica por falta de criatividade", LocalDate.parse("2004-12-05")));
		
		Emprestimo e1 = new Emprestimo(
				145, 
				LocalDate.parse("2024-03-05"),
				arquivos1
				);
		
		e1.fazerDevolucao(LocalDate.parse("2024-03-22"));
		e1.imprimeEmprestimo();
		
		System.out.println("\n\n\n");
		
		// 2° emprestimo
		
				ArrayList<Arquivo> arquivos2 = new ArrayList<>();
				arquivos2.add(new Livro(12, "O pequeno Principe", 1943));
				
				Emprestimo e2 = new Emprestimo(
						10, 
						LocalDate.parse("2024-05-09"),
						arquivos2
						);
				
				e2.imprimeEmprestimo();
	}

}
