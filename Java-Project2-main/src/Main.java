
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // Create a new ArrayList which contains Cupcake and call it cupcakeMenu
        ArrayList<Cupcake> cupcakeMenu= new ArrayList<Cupcake>();

        // Create a new Cupcake object named cupcake
        Cupcake cupcake= new Cupcake();

        // Create a new RedVelvet object named redVelvet
        RedVelvet redVelvet= new RedVelvet();

        // Create a new Chocolate object named chocolate
        Chocolate chocolate= new Chocolate();


        // Print "We are in the middle of creating the cupcake menu. We currently have three cupcakes on
        // the menu, but we need to decide on pricing"
        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on" +"\nthe menu but we need to decide on pricing");

        // Create a Scanner object named input so we can accept the users input
        Scanner scan= new Scanner(System.in);


        // Print "We are deciding on the price for our standard cupcake. Here is the description:"
        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");

        // Call the type() method on the cupcake object to get the description of the standard cupcake
        cupcake.type();

        // Print "How much would you like to charge for the cupcake?
        // (Input a numerical number taken to 2 decimal places)"
        System.out.println("\tHow much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");


        // Create a String variable named priceText and assign it the value of input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        String priceText= scan.nextLine();

        // Create a double variable named price and set it equal to Double.parseDouble(priceText)
        double price= Double.parseDouble(priceText);

        // Now that we have the price, we can call the setPrice() method with the parameter of price on the cupcake object
        cupcake.setPrice(price);


        // Print "We are deciding on the price for our red velvet cupcake. Here is the description:"
        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");

        // Call the type() method on the redVelvet object to get the description of the red velvet cupcake
        redVelvet.type();

        // Print "How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)"
        System.out.println("\tHow much would you like to charge for the red velvet cupcake? (Input a numerical number taken to 2 decimal places)");

        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText=scan.nextLine();

        // Set the double variable named price equal to Double.parseDouble(priceText)
        price=Double.parseDouble(priceText);

        // Now that we have the price, we can call the setPrice() method with the parameter of price on the redVelvet object
        redVelvet.setPrice(price);


        // Print "We are deciding on the price for our chocolate cupcake. Here is the description:"
        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description:");

        // Call the type() method on the chocolate object to get the description of the chocolate cupcake
        chocolate.type();

        // Print "How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)"
        System.out.println("\tHow much would you like to charge for the chocolate cupcake? (Input a numerical number taken to 2 decimal places)");


        // Set the String variable named priceText equal to input.nextLine()
        // We are accepting the price as a String named priceText so we can convert it into a double later, just for practice
        priceText=scan.nextLine();

        // Set the double variable named price equal to Double.parseDouble(priceText)
        price=Double.parseDouble(priceText);

        // Now that we have the price, we can call the setPrice() method with the parameter of price on the chocolate object
        chocolate.setPrice(price);

        // Add cupcake to cupcakeMenu
        cupcakeMenu.add(cupcake);

        // Add redVelvet to cupcakeMenu
        cupcakeMenu.add(redVelvet);

        // Add chocolate to cupcakeMenu
        cupcakeMenu.add(chocolate);

        // Create a new ArrayList which contains Drink and call it drinkMenu
        ArrayList<Drink> drinkMenu= new ArrayList<Drink>();

        // Create a new Drink object named water
        Drink water= new Drink();

        // Create a new Soda object named soda
        Soda soda=new Soda();

        // Create a new Milk object named milk
        Milk milk=new Milk();

        System.out.println("We are deciding on the price for our drinks. Here is the description:");

        water.type();
        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");


        String priceTextDrinks= scan.nextLine();

        double priceDrinks=Double.parseDouble(priceTextDrinks);

        water.setPrice(priceDrinks);

        System.out.println("We are deciding on the price for our soda drink. Here is the description:");

        soda.type();

        System.out.println("How much would you like to charge for the soda drink? (Input a numerical number taken to 2 decimal places)");


        priceTextDrinks=scan.nextLine();

        priceDrinks=Double.parseDouble(priceTextDrinks);

        soda.setPrice(priceDrinks);

        System.out.println("We are deciding on the price for our milk drink. Here is the description:");

        milk.type();

        System.out.println("How much would you like to charge for the milk drink? (Input a numerical number taken to 2 decimal places)");


        priceTextDrinks=scan.nextLine();

        priceDrinks=Double.parseDouble(priceTextDrinks);

        milk.setPrice(priceDrinks);
        //This line of code uses the "Double.parseDouble()" method to convert the string value of "priceText" to a double and assigns it to the variable "price".


        drinkMenu.add(water);

        drinkMenu.add(soda);

        drinkMenu.add(milk);

        Order order= new Order(cupcakeMenu,drinkMenu);



    }
}
// Create a new class named Cupcake. This will be the class all other cupcakes inherit from
class Cupcake{

    // Create a public double variable named price, but do not assign it a value
    public double price;

    // Create a public function named getPrice that has no parameters and returns the price
    public double getPrice(){
        return price;
    }


    // Create a public function named setPrice that has one parameter, a double named price, and returns void
    public void setPrice(double price){
        this.price=price;
    }


    // Create a public function named type that prints a description and returns void
    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting");
        return;

    }

}

// Create a new class named RedVelvet that extends from Cupcake
class Chocolate extends Cupcake{

    // Create a public function named type that returns void and prints a description of the cupcake
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting.");
        return;
    }
}

// Create a new class named Chocolate that extends from Cupcake
class RedVelvet extends Cupcake{

    // Create a public function named type that returns void and prints a description of the cupcake
    public void type(){
        System.out.println("A red velvet based cupcake, with cream cheese frosting.");
        return;
    }
}

// Create a new class named Drink. This will be the class all other drinks inherit from
class Drink{

    // Create a public double variable named price, but do not assign it a value
    public double price;


    // Create a public function named getPrice that has no parameters and returns the price
    public double getPrice(){ return price; }


    // Create a public function named setPrice that has one parameter, a double named price, and returns void
    public  void setPrice(double price){ this.price=price; }



    // Create a public function named type that prints a description and returns void
    public void type(){
        System.out.println("A bottle of water");
        return;


    }

}


//Create a new class named Milk that extends from Drink
class Milk extends Drink{

    // Create a public function named type that prints a description and returns void
    public void type(){

        System.out.println("A bottle of Milk");
        return;
    }
}

// Create a new class named Soda that extends from Drink
class Soda extends Drink{

    // Create a public function named type that prints a description and returns void
    public void type(){
        System.out.println("A bottle of soda");
        return;

    }
}