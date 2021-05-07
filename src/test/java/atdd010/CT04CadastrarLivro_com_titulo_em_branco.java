package atdd010;

import static org.junit.Assert.*;

import org.junit.Test;

public class CT04CadastrarLivro_com_titulo_em_branco {

	@Test
	public void ct04_quando_dado_titulo_em_branco() {
		Biblioteca biblioteca = new Biblioteca(); 
	 	Livro umLivro = new Livro("12345", "", "Pressman"); 
	 	biblioteca.add(umLivro); 
	 	assertEquals("", umLivro.empty);
	}

}
