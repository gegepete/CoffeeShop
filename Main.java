import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line;
        String[] input;
        
        while (true) {
            line = scanner.nextLine();
            input = line.split("\\s+");
            
            try {
                switch(input[0].toUpperCase()) {
                    case "ADD" :
                        addDrink(input);
                        break;
                }
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
    
    private static void addDrink(String[] input){
        String name = input[2];
        double price = Double.parseDouble(input[3]);
        if (input[1].equalsIgnoreCase("BERE")) {
            int alcohol = Integer.parseInt(input[4]);
            Drinks d = new Beer(name, price, 5, alcohol);
            CoffeeShop.getInstance().addDrinks(d);
        }else if (input[1].equalsIgnoreCase("COFFEE")) {
            Drinks d = new Coffee(name, price, 5);
            CoffeeShop.getInstance().addDrinks(d);
        }else{
            throw new RuntimeException("Type does not exist!");
        }
    }
}