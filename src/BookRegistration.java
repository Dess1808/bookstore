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
	}
}
