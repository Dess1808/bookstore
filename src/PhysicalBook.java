public class PhysicalBook extends Book{
    
    //constructor 
    public PhysicalBook(Author author){
        //mantando a super classe inicializar receber objeto autor
        super(author);
    }

    public double getPrintingRate(){
        return this.getValue() * 0.5;
    }
}
