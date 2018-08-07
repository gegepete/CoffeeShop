import java.util.*;
public class CoffeeShop {
    private static CoffeeShop singleton = null;
    public Map<String, Drinks> drinks = new HashMap<>();
    
    private CoffeeShop(){
    }
    
    public static CoffeeShop getInstance(){
        if (singleton == null) {
            singleton = new CoffeeShop();
        }
        return singleton;
    }
    
    public void addDrinks(Drinks d){
        drinks.put(d.name, d);
    }
    
    public void sellDrink(String name) throws InsufficientStockException {
        Drinks d = drinks.get(name);
        if (d.stock <= 0) {
            throw new InsufficientStockException();
        }
        System.out.println(d + " have been sold.");
        d.stock--;
    }
    
    public void showDrinks() {
        // drinks.forEach((k, v) -> System.out.println(v));
        
        for (String k : drinks.keySet()) {
            Drinks d = drinks.get(k);
            System.out.println(d);
        }
    }
    
    public void showBeers() {
        for (String k : drinks.keySet()) {
            Drinks d = drinks.get(k);
            if (d instanceof Beer) {
                System.out.println(d);
            }
        }
    }
    
    public void deleteDrink(String name){
        drinks.remove(name);
    }
}