package atdd010;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class CT01CadastrarLivro_com_sucesso {

	@Test 
	public void ct01_quando_dados_validos_cadastra_com_sucesso() { 
		Biblioteca biblioteca = new Biblioteca(); 
	 	Livro umLivro = new Livro("1111", "Engenharia de Software", "Pressman"); 
	 	biblioteca.add(umLivro); 
	 	assertEquals (1, biblioteca.size()); 
	}
}
