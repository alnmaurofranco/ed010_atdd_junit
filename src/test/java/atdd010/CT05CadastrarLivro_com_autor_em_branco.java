package atdd010;

import static org.junit.Assert.*;

import org.junit.Test;

public class CT05CadastrarLivro_com_autor_em_branco {

	@Test
	public void ct05_quando_dado_autor_em_branco() {
		Biblioteca biblioteca = new Biblioteca(); 
	 	Livro umLivro = new Livro("12345", "Engenharia de Software", ""); 
	 	biblioteca.add(umLivro); 
	 	assertEquals("", biblioteca.empty());
	}
}
