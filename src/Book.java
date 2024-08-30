//package src.bookstore;

public class Book {
	String name;
	String description;
	double value;
	String isbn;
	String authorName;
	String authorEmail;
	String authorCpf;
	Author author;
	
	//methods
	
	void showDetails() {
		String menssage = "Mostrando detalhes do livro";
		System.out.println(menssage);
		System.out.println("Nome: " + name);
		System.out.println("Descricao: " + description);
		System.out.println("Valor: R$ " + value);
		System.out.println("ISBN: " + isbn);
		
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
	public void applyDiscout(double percentege) {
		this.value -= this.value * percentege;
	}
	
	//there author?
	boolean thereAuthor() {
		boolean notNull = this.author != null;
		return notNull;
	}
}




