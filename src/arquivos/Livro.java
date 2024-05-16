package arquivos;

import java.time.LocalDate;

public class Livro extends Arquivo{
	
	private int ano;
	
	
	public Livro(int codigo, String descricao, int ano) {
		super(codigo, descricao);
		
		setAno(ano);
		
	}
	
	

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	@Override
	public int calcularMulta(LocalDate diaEmprestimo, LocalDate diaDevolucao) {
		
		int diasTotal = diaDevolucao.compareTo(diaEmprestimo);
		if(diasTotal > 5 && diasTotal <= 8) return (diasTotal-5)*5;
		else if(diasTotal >8) return(diasTotal-5)*7;
		else return 0;
			
		
	}
	
	@Override
	public void imprimeConteudo() {
		System.out.println("Livro--");
		super.imprimeConteudo();
		System.out.println("Ano de lançamento: " + ano);
	}
	



}
