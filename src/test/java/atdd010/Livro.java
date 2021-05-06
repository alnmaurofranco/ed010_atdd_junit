package atdd010;

public class Livro {
	String isbn;
	
	public Livro(String isbn, String titulo, String autor) {
		super();
		
		this.isbn = isbn;
	} 
	
	public String getIsbn() { 
		 return isbn; 
	} 
	
	public void setIsbn(String isbn) { 
		this.isbn = isbn; 
	}
}

