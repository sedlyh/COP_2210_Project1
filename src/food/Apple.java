package food;
public class Apple {
    private String type;
    private double weight;
    private double pricePreUnitWeight;

    public Apple(String type, double pricePreUnitWeight, double weightInGrams) {
// convert gram into lbs
        weight = 0.00220 * weightInGrams;
        this.type = type;
        this.pricePreUnitWeight = pricePreUnitWeight;
    }
        //----------------------------------------------------------
    // Setters and Getters
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPricePreUnitWeight() {
        return pricePreUnitWeight;
    }

    public void setPricePreUnitWeight(double pricePreUnitWeight) {
        this.pricePreUnitWeight = pricePreUnitWeight;
    }


    public void displayInfo(){
        System.out.println("==========================================");
        System.out.println("Apple Info");
        System.out.println("==========================================");
        System.out.printf("Type:\t\t\t\t %-15s\n", type);
        System.out.printf("Weight:\t\t\t\t %-6.4f lbs\n", weight);
        System.out.printf("Price Pre Unit:\t\t %-10.2f\n", pricePreUnitWeight);
    }


// YOUR CODE HERE
// price method
// done for you :)
    public double price(){
        double price = weight * pricePreUnitWeight;
        return price;
    }
}//end of class
