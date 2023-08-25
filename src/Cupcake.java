public class Cupcake {
    public double price;

    public double getPrice() {
        return price;
    }
    public void setPrice(double price){
        this.price = price;
        return;
    }
    public void type(){
        System.out.println("A basic, generic cupcake, with vanilla frosting");
        return;
    }
}

class RedVelvet extends Cupcake {
    public void type(){
        System.out.println("A red velvet based cupcake, with cream cheese frosting");
    }
}

class Chocolate extends Cupcake {
    public void type(){
        System.out.println("A chocolate based cupcake, with chocolate frosting");
    }
}