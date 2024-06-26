public class Main {

    public static void main(String[] args) {

        Meal regularMeal = new Meal();
        regularMeal.changeDrinkSize("L");
        regularMeal.addBurgerTopping("Tomatoes", 0.10);
        regularMeal.addBurgerTopping("Onions", 0.10);
        regularMeal.addBurgerTopping("Cheese", 0.25);
        regularMeal.addBurgerTopping("Olives", 0.15);
        System.out.println(regularMeal.getBill());

        Meal deluxeMeal = new Meal(new Burger("Deluxe Burger", 10.00),
                new Drink("Thums Up", "XL"),
                new Side("Potato Wedges", 2.00));
        deluxeMeal.addBurgerTopping("Tomatoes", 0.10);
        deluxeMeal.addBurgerTopping("Onions", 0.10);
        deluxeMeal.addBurgerTopping("Cheese", 0.25);
        deluxeMeal.addBurgerTopping("Olives", 0.15);
        deluxeMeal.addBurgerTopping("Pickles", 0.05);
//        deluxeMeal.addBurgerTopping("overloading", 10);
        System.out.println(deluxeMeal.getBill());
    }
}
