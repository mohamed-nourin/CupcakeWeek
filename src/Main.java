import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupcakeMenu = new ArrayList<Cupcake>();
        ArrayList<Drink> drinkMenu = new ArrayList<Drink>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");
        cupcake.type();

        System.out.println("How much would you like to charge for the cupcake? (Enter a numerical number taken to 2 decimal places)");

        String priceText = input.nextLine();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description: ");
        redVelvet.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");

        String priceTextRedVelvet = input.nextLine();
        double priceRedVelvet = Double.parseDouble((priceTextRedVelvet));

        redVelvet.setPrice(priceRedVelvet);

        System.out.println("We are deciding the price for our chocolate cupcake. Here is the description: ");
        chocolate.type();

        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");

        String priceTextChocolate = input.nextLine();
        double priceChocolate = Double.parseDouble(priceTextChocolate);

        chocolate.setPrice(priceChocolate);

        System.out.println("We are deciding the price for water. Here is the description: ");
        water.type();
        System.out.println("How much would you like to charge for water? (Input a numerical number taken to 2 decimal places)");

        String priceTextWater = input.nextLine();
        double priceWater = Double.parseDouble(priceTextWater);

        water.setPrice(priceWater);

        System.out.println("We are deciding the price for soda. Here is the description: ");
        soda.type();
        System.out.println("How much would you like to charge for soda? (Input a numerical number taken to 2 decimal places)");

        String priceTextSoda = input.nextLine();
        double priceSoda = Double.parseDouble(priceTextSoda);

        soda.setPrice(priceSoda);

        System.out.println("We are deciding the price for milk. Here is the description: ");
        milk.type();
        System.out.println("How much would you like to charge for milk? (Input a numerical number taken to 2 decimal places)");

        String priceTextMilk = input.nextLine();
        double priceMilk = Double.parseDouble(priceTextMilk);

        milk.setPrice(priceMilk);


        cupcakeMenu.add(cupcake);
        cupcakeMenu.add(redVelvet);
        cupcakeMenu.add(chocolate);
        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);
        new Order(cupcakeMenu, drinkMenu);
    }
}