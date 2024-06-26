public class Burger {

    private String type, toppings;
    private double price;
    private int numToppings, maxToppings;

    public Burger(String type, double basePrice) {

        this.type = type;
        this.price = basePrice;
        numToppings = 0;
        toppings = "";

        if (isDeluxe()) {
            maxToppings = 5;
        } else {
            maxToppings = 3;
        }
    }

    public void addTopping(String topping, double price) {

        if (numToppings < maxToppings) {

            numToppings++;

            if (numToppings == 1) {
                toppings += topping;
            } else {
                toppings += " + " + topping;
            }

            if (!isDeluxe()) {
                this.price += price;
            }
        } else {
            System.out.println("Maximum number of toppings already added");
        }
    }

    public String getPrice() {

        return String.format("%.2f", price);
    }

    public String getBurgerBill() {

        String toppingsForBill;
        if (toppings.isEmpty()) {
            toppingsForBill = "No toppings";
        } else {
            toppingsForBill = toppings;
        }

        return String.format("%s (%s) - $%.2f", type, toppingsForBill, price);
    }

    public boolean isDeluxe() {

        return type.toLowerCase().contains("deluxe");
    }
}
