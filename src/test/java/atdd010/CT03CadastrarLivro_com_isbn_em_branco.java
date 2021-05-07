package atdd010;

import static org.junit.Assert.*;

import org.junit.Test;

public class CT03CadastrarLivro_com_isbn_em_branco {

	@Test
	public void ct03_quando_dado_isbn_em_branco() {
		Biblioteca biblioteca = new Biblioteca(); 
	 	Livro umLivro = new Livro("", "Engenharia de Software", "Pressman"); 
	 	biblioteca.add(umLivro); 
	 	assertEquals("", umLivro.isbn);
	}

}