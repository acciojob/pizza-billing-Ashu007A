package com.driver;

public class Pizza {
    protected boolean isVeg;
    protected boolean extraCheeseAdded;
    protected boolean extraToppingsAdded;
    protected boolean takeawayAdded;
    protected int basePrice;
    protected int extraCheesePrice;
    protected int extraToppingsPrice;
    protected int paperBagPrice;

    public Pizza(boolean isVeg) {
        this.isVeg = isVeg;
        this.extraCheeseAdded = false;
        this.extraToppingsAdded = false;
        this.takeawayAdded = false;
        this.basePrice = isVeg ? 300 : 400;
        this.extraCheesePrice = 80;
        this.extraToppingsPrice = isVeg ? 70 : 120;
        this.paperBagPrice = 20;
    }

    public void addExtraCheese() {
        if (!extraCheeseAdded) {
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!extraToppingsAdded) {
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway() {
        if (!takeawayAdded) {
            takeawayAdded = true;
        }
    }

    public int getPrice() {
        int totalPrice = basePrice;
        if (extraCheeseAdded) {
            totalPrice += extraCheesePrice;
        }
        if (extraToppingsAdded) {
            totalPrice += extraToppingsPrice;
        }
        if (takeawayAdded) {
            totalPrice += paperBagPrice;
        }
        return totalPrice;
    }

    public String getBill() {
        StringBuilder bill = new StringBuilder();
        bill.append("Base Price Of The Pizza: ").append(basePrice).append("\n");
        if (extraCheeseAdded) {
            bill.append("Extra Cheese Added: ").append(extraCheesePrice).append("\n");
        }
        if (extraToppingsAdded) {
            bill.append("Extra Toppings Added: ").append(extraToppingsPrice).append("\n");
        }
        if (takeawayAdded) {
            bill.append("Paperbag Added: ").append(paperBagPrice).append("\n");
        }
        bill.append("Total Price: ").append(getPrice()).append("\n");
        return bill.toString();
    }
}
