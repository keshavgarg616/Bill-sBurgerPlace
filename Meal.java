package com.billsburgers;

public class Meal {

    private Burger burger;
    private Drink drink;
    private Side side;

    public Meal() {

        this("Regular burger", 2.00,
                "Coke", "S",
                "Fries", 1.25);
    }

    public Meal(String burgerType, double burgerBasePrice,
                String drinkType, String drinkSize,
                String sideType, double sidePrice) {

        burger = new Burger(burgerType, burgerBasePrice);
        drink = new Drink(drinkType, drinkSize);
        side = new Side(sideType, sidePrice);
    }

    public String getBill() {

        return "=".repeat(46) + "\nBILL\n-----\n" +
                burger.getBurgerBill() + "\n" + drink.getDrinkBill() +
                (burger.isDeluxe() ? "0" : drink.getPrice()) +
                "\n" + side.getSideBill() +
                (burger.isDeluxe() ? "0" : side.getPrice()) +
                "\n\nTotal: $" + String.format("%.2f", getTotalPrice()) + "\n" + "=".repeat(46);
    }

    public double getTotalPrice(){

        return burger.isDeluxe() ? Double.parseDouble(burger.getPrice()) : Double.parseDouble(burger.getPrice()) + Double.parseDouble(drink.getPrice()) + Double.parseDouble(side.getPrice());
    }

    public void changeDrinkSize(String newDrinkSize) {

        drink.changeSize(newDrinkSize);
    }

    public void addBurgerTopping(String topping, double price) {

        burger.addTopping(topping, price);
    }
}
