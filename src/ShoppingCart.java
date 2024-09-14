public class ShoppingCart {
    
    private double total;

    public void addBook(Book book){
        //System.out.println("add: " + book);
        book.applyDiscout(0.05);
        total += book.getValue();
    }

    //gettter and setter
    public double getTotal(){
        return total;
    }
}
