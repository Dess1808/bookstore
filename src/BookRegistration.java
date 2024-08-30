//package src.bookstore;

public class BookRegistration {
	public static void main(String[] args) {
		
		//Author of book
		Author author = new Author();
		author.name = "Rodrigo Turini";
		author.email = "turini@gmail.com";
		author.cpf = "123.456.789-09";
		
		Book book = new Book();
		book.name = "Java 8 Pratico";
		book.description = "Novos Recursos de Linguagem";
		book.value = 59.90;
		book.isbn = "123-56-6568980-56-6";
		book.author = author; //referencia??
		
		//out
		book.showDetails();
		
		//author of otherBook
		Author otherAuthor = new Author();
		otherAuthor.name = "Paulo Silveira";
		otherAuthor.email = "silveira@gmail.com";
		otherAuthor.cpf = "789.456.132-56";
		
		//new book
		Book otherBook = new Book();
		otherBook.name = "Logica de Programacao";
		otherBook.description = "Crie seus primeiros programas";
		otherBook.value = 59.90;
		otherBook.isbn = "132159-56598-9898";
		otherBook.author = otherAuthor;
		
		//out 
		otherBook.showDetails();
		
		//third book whitout author
		Book thirdBook = new Book();
		thirdBook.name = "The witcher";
		thirdBook.description = "Um bruxo viajente";
		thirdBook.value = 99.90;
		thirdBook.isbn = "131-89-656565-9565";
		
		thirdBook.showDetails();
	}
}

