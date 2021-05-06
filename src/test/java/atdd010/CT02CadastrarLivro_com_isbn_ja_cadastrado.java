package atdd010;

import static org.junit.Assert.*;

import org.junit.Test;

public class CT02CadastrarLivro_com_isbn_ja_cadastrado {

	@Test
	public void test() {
		Biblioteca biblioteca = new Biblioteca(); 
	 	Livro umLivro = new Livro("12345", "Engenharia de Software", "Pressman"); 
	 	biblioteca.add(umLivro); 
	 	assertEquals("12345", umLivro.isbn);
	}

}
