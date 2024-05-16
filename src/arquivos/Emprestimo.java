package arquivos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Emprestimo {
	
	private int numero;
	private LocalDate diaEmprestimo;
	private LocalDate diaDevolucao = null; //Caso não tiver devolvido, a data é nula;
	
	private ArrayList<Arquivo> arquivos;
	
	
	public Emprestimo(int numero, LocalDate diaEmprestimo, ArrayList<Arquivo> arquivos) {
		
		this.numero = numero;
		this.diaEmprestimo = diaEmprestimo;
		this.arquivos = arquivos;
		
	}
	
	private int calcularMulta(LocalDate data) {
		
		int multa = 0;
		for(Arquivo a : arquivos) {
			multa += a.calcularMulta(diaEmprestimo, data);
		}
		
		return multa;
	}
	
	public void fazerDevolucao(LocalDate diaDevolucao) {
		
		this.diaDevolucao = diaDevolucao;
		
		
	}
	
	public void imprimeEmprestimo() {
		System.out.println("Número: " + this.numero);
		System.out.println("Dia de empréstimo: " + diaEmprestimo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		if(diaDevolucao != null) {
			System.out.println("Dia de devolucao: " + diaDevolucao.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
			System.out.println("Multa: "+ calcularMulta(diaDevolucao) + " reais\n");
			
		}
		else {
			System.out.println("NÃO DEVOLVIDO!");
			System.out.println("Multa: "+ calcularMulta(LocalDate.now()) + " reais\n");
		}
		
		for(Arquivo a : arquivos) {
			System.out.print("    ");
			a.imprimeConteudo();
		}
	}

}
