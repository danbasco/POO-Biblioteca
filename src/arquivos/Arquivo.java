package arquivos;

import java.time.LocalDate;

public class Arquivo {
	
	private int codigo;
	private String descricao;
	
	public Arquivo(int codigo, String descricao) {
		
		this.codigo = codigo;
		this.descricao = descricao;
		
	}
	
	
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int calcularMulta(LocalDate diaEmprestimo, LocalDate diaDevolucao) {
		return 0;
	}
	
	public void imprimeConteudo() {
		System.out.println("Descricao: " + descricao);
	}
}
