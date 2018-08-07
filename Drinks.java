public class Drinks {
    public String name;
    public double price;
    public int stock;
    
    public Drinks(String name, double price, int stock){
        this.name = name;
        this.price = price;
        this.stock = stock;        
    }
    
    @Override
    public String toString(){
        return name + " " + price + " : " + stock;
    }
    
    public boolean equals(Object o){
        if (!(o instanceof Drinks)) {
            return false;
        }
        
        Drinks b = (Drinks) o;
        return this.name.equals(b.name);
    }
}