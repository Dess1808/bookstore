public class Book {
	private String name; 
	private String description;
	private double value;
	private String isbn;
	Author author;
	
	//constructor
	public Book(Author author) {
		this.author = author;
		this.isbn = "000-00-0000-00-00";
	}
	
	//methods sets
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setValue(double value) {
		this.value = value;
	}
	
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	//methods gets
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public double getValue() {
		return value;
	}
	
	public String getIsbn() {
		return isbn;
	}
	
	//get author, tipo de retorno , author
	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}

	
	public void showDetails() {
		String menssage = "Mostrando detalhes do livro";
		System.out.println(menssage);
		System.out.println("Nome: " + this.name);  
		System.out.println("Descricao: " + this.description);
		System.out.println("Valor: R$ " + this.value);
		System.out.println("ISBN: " + this.isbn);
		
		//detalis for author of book, if there is.
		if (this.thereAuthor()) {
			author.showDetailsAuthor();
		}
		else {
			System.out.println("Author not registered");
		}
		
		//newline
		System.out.println("--");
	}
	
	
	//apply descount
	public boolean applyDiscout(double percentege) {
		if (percentege > 0.3) {
			return false;
		}
		 
		this.value -= this.value * percentege;
		return true;
	}
	
	//there author?
	boolean thereAuthor() {
		boolean notNull = this.author != null;
		return notNull;
	}
}




