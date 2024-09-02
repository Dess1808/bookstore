public class DiscountRules {
	
	public static void main(String[] args) {
		
		Author author = new Author();
		
		Book book = new Book(author);
		book.setValue(59.90);
		
		//output
		System.out.println("Valor: " + book.getValue());
		
		if (!book.applyDiscout(0.1)) {
			System.out.println("Desconto nao pode ser maior que 30!");
		}else {
			//depois que e feito o calculo no "value", basta chamar novamente o "value"
			System.out.println("Valor com desconto: " + book.getValue());
		}
		
		
		//test
		//book.showDetails();
	}
}
 