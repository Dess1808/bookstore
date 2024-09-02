public class BookRegistration {
	
	public static void main(String[] args) {
		
		//Author of book
		Author author = new Author();
		author.setName("Rodrigo Turini");
		author.setEmail("turini@gmail.com");
		author.setCpf("123.456.789-09");
		
		Book book = new Book(author);		
		book.setName("Java  8 Pratico");
		book.setDescription("Novos recursos de Linguagem");
		book.setValue(59.90);
		//book.setIsbn("123-56-6568980-56-6");
		book.author = author;
		
		//out
		book.showDetails();	

		//ebook author
		Author otherAuthor = new Author();
		otherAuthor.setName("Gabriel Souza Martins");
		otherAuthor.setEmail("gabriel@gmail.com");
		otherAuthor.setCpf("00454625260");

		Ebook ebook = new Ebook(author);
		ebook.setName("Livro");
		ebook.setDescription("descricao livro");
		ebook.setValue(100.00);
		ebook.setWaterMark("marca dgua"); 
		ebook.author = otherAuthor;

		//output other author
		ebook.showDetails();
		
		if (!ebook.applyDiscout(0.16)){
			System.err.println("Desconto nao pode maior que 15%");
		}else{
			System.out.println("Deconto: " + ebook.getValue());
		}
	}
}
