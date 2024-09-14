public class SaleRecord {
    
    public static void main(String[] args) {
        
        //Author create 
        Author author = new Author();
        author.setName("Maurice Aniche");

        //physical book
        PhysicalBook physical = new PhysicalBook(author);   
        physical.setName("Test-Drive Development");

        //ebook create 
        Ebook ebook = new Ebook(author); //same author
        ebook.setName("Test-Drive Development"); 
    }
}