public class Meal {

    private Burger burger;
    private Drink drink;
    private Side side;

    public Meal() {

        this(new Burger("Regular burger", 2.00), 
                new Drink("Coke", "S"), 
                new Side("Fries", 1.25));
    }

    public Meal(Burger burger, Drink drink, Side side) {

        this.burger = burger;
        this.drink = drink;
        this.side = side;
    }

    public String getBill() {

        String bill = "==============================================\nBILL\n-----\n" +
                burger.getBurgerBill() + "\n" + drink.getDrinkBill();

        if (burger.isDeluxe()) {
            bill += "0";
        } else {
            bill += drink.getPrice();
        }

        bill += "\n" + side.getSideBill();

        if (burger.isDeluxe()) {
            bill += "0";
        } else {
            bill += side.getPrice();
        }

        bill += "\n\nTotal: $" + String.format("%.2f", getTotalPrice()) + "\n==============================================";

        return bill;
    }

    public double getTotalPrice(){

        if (burger.isDeluxe()) {
            return Double.parseDouble(burger.getPrice());
        } else {
            return Double.parseDouble(burger.getPrice()) + Double.parseDouble(drink.getPrice()) + Double.parseDouble(side.getPrice());
        }
    }

    public void changeDrinkSize(String newDrinkSize) {

        drink.changeSize(newDrinkSize);
    }

    public void addBurgerTopping(String topping, double price) {

        burger.addTopping(topping, price);
    }
}
