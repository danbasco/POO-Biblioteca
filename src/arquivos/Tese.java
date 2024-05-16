package arquivos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Tese extends Arquivo{
	
	private LocalDate data;

	
	public Tese(int codigo, String descricao, LocalDate data) {
		super(codigo, descricao);
		setData(data);
		
	}

	
	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public int calcularMulta(LocalDate diaEmprestimo, LocalDate diaDevolucao) {
		
		int diasTotal = diaDevolucao.compareTo(diaEmprestimo);
		if(diasTotal > 10 && diasTotal <= 15) return (diasTotal-10)*10;
		else if(diasTotal > 15) return 100;
		
		
		else return 0;
	}
	
	
	@Override
	public void imprimeConteudo() {
		
		System.out.println("Tese de Doutorado--");
		super.imprimeConteudo();
		System.out.println("Data de Aprovação: " + data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
	}


}
