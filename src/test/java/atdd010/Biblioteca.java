package atdd010;

import java.util.ArrayList; 
import java.util.List;

public class Biblioteca { 
 private List<Livro> livros = new ArrayList<>(); 
 
 	public void add(Livro livro) { 
 		livros.add(livro); 
 	} 
 
 	public int size() { 
 		return livros.size(); 
 	}
 	
 	public String isbn() {
 		return livros.get(0).getIsbn();
 	}
}

