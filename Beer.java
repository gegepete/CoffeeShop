public class Beer extends Drinks {
    public int alcohol;
    public Beer(String name, double price, int stock, int alcohol){
        super(name, price, stock);
        this.alcohol = alcohol;
    }
}