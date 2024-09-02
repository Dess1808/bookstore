public class Ebook extends Book{
    
    //personalizado
    private String waterMark;

    //constructor
    public Ebook(Author author){ 
        super(author);//Delegate constructor
    }

    //apply discount ebook
    @Override //anotations
    public boolean applyDiscout(double percentege){
        if (percentege > 0.15){
            return false;
        } 

        //update value
        double discount = this.getValue() * percentege;
        this.setValue(this.getValue() - discount);

        return true;
    }

    //getter and setters
    public void setWaterMark(String waterMark){
        this.waterMark = waterMark;
    }                              
    
    public String getWaterMark(){
        return waterMark;
    }
}
