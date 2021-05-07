package atdd010;

public class Livro {
	String isbn;
	String titulo;
	String autor;
	
	public Livro(String isbn, String titulo, String autor) {
		super();
		
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	} 
	
	public String getIsbn() { 
		 return isbn; 
	} 
	
	public void setIsbn(String isbn) { 
		this.isbn = isbn; 
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
} 

