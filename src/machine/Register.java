package machine;
import food.Apple;
import food.Sandwich;
import transactions.Payment;



public class Register {

    private static int registerCounter = 0;
    private static final String REGISTERCODE = "US-FL-032020-";
    private static final double DOLLARVALUE = 1.00;
    private static final double QUATERVALUE = 0.25;
    private static final double DIMEVALUE = 0.10 ;
    private static final double NICKELVALUE = 0.05;
    private static final double PENNYVALUE = 0.01;

    private String registerID;
    private int numberOfOneDollarBills;
    private int numberOfQuarters;
    private int numberOfDimes;
    private int numberOfNickels;
    private int numberOfPennies;
    private double currentTotal;

    public Register(int numberOfOneDollarBills,
                    int numberOfQuarters,
                    int numberOfDimes,
                    int numberOfNickels,
                    int numberOfPennies) {

        registerCounter++;
        registerID = REGISTERCODE + registerCounter;

        currentTotal = 0.0;

        this.numberOfOneDollarBills = numberOfOneDollarBills;
        this.numberOfQuarters = numberOfQuarters;
        this.numberOfDimes = numberOfDimes;
        this.numberOfNickels = numberOfNickels;
        this.numberOfPennies = numberOfPennies;
    }
    //----------------------------------------------------------
// Utility methods
// Check UML Diagram
//----------------------------------------------------------
    private double cashValue(){
        double total = numberOfOneDollarBills * DOLLARVALUE +
                numberOfQuarters * QUATERVALUE +
                numberOfDimes * DIMEVALUE +
                numberOfNickels * NICKELVALUE +
                numberOfPennies * PENNYVALUE;
        return total;
    }
    public void cashInfo(String personal){
        if(personal.equals("Manager")){
            System.out.println("==========================================");
            System.out.println("Register Cash Info");
            System.out.println("==========================================");
            System.out.println("Access Level:\t\t\t Valid");
            System.out.printf("Cash in the Register:\t $%-15.2f\n", cashValue());
            System.out.printf("Dollars:\t\t\t\t %-15d\n", numberOfOneDollarBills);
            System.out.printf("Quarters:\t\t\t\t %-15d\n", numberOfQuarters);
            System.out.printf("Dimes:\t\t\t\t\t %-15d\n", numberOfDimes);
            System.out.printf("Nickels:\t\t\t\t %-15d\n", numberOfNickels);
            System.out.printf("Pennies:\t\t\t\t %-15d\n", numberOfPennies);
            System.out.println("");
        } else{
            System.out.println("==========================================");
            System.out.println("Register Cash Info");
            System.out.println("==========================================");
            System.out.println("Access Level:\t\t Not Valid by " + personal);
            System.out.println("");
        }
    }

    public void buyApple(Apple apple, Payment payment){
        System.out.println("==========================================");
        System.out.println("Register Buy Apple");
        System.out.println("==========================================");
        System.out.printf("Apple Price:\t\t $%-15.2f\n" , apple.price() );
        System.out.printf("Payment:\t\t\t $%-15.2f\n" , payment.paymentValue() );

        if(apple.price() > payment.paymentValue()){
            double shortAmount = apple.price() - payment.paymentValue();

            System.out.printf("You need:\t\t\t $%-15.2f\n",shortAmount );
            System.out.println("");
            System.out.println("Sorry but you do not have enough money to buy the Apple");
            System.out.println("==========================================");
            System.out.println("\n");
        }else{
            giveChange(apple.price(), payment);
        }

    // else you have enough payment then give change to buyer
    // hence call the giveChange method with the apple price and payment
    // hint: use an if else statement
    // YOUR CODE HERE
    }//end buyApple()


    public void buySandwich(Sandwich sandwich, Payment payment){
        System.out.println("==========================================");
        System.out.println("Register Buy Sandwich");
        System.out.println("==========================================");
        System.out.printf("Sandwich Price:\t\t $%-15.2f\n" , sandwich.getPrice() );
        System.out.printf("Payment:\t\t\t $%-15.2f\n" , payment.paymentValue() );

        if(sandwich.getPrice() > payment.paymentValue()){
            double shortAmount = sandwich.getPrice() - payment.paymentValue();

            System.out.printf("You need:\t\t\t $%-15.2f\n",shortAmount );
            System.out.println("");
            System.out.println("Sorry but you do not have enough money to buy the Sandwich");
            System.out.println("==========================================");
            System.out.println("\n");
        }else{
            giveChange(sandwich.getPrice(), payment);
        }
    }//end buySandwich()


    private void giveChange(double price, Payment payment){
//        update the register

        numberOfOneDollarBills += payment.getNumberOfOneDollarBills();
        numberOfQuarters += payment.getNumberOfQuarters(); ;
        numberOfDimes += payment.getNumberOfDimes(); ;
        numberOfNickels += payment.getNumberOfNickels();
        numberOfPennies += payment.getNumberOfPennies();


        double neededChange = payment.paymentValue() - price;


        int neededChangeWhole = (int)Math.round(neededChange * 100);
        System.out.printf("Change:\t\t\t\t $%-15.2f\n", neededChange);


//        output the change

        int changeDollars = neededChangeWhole / 100;
        neededChangeWhole -= changeDollars * 100;

        if(changeDollars > 0){
            System.out.printf("Dollars:\t\t\t %-15d\n", changeDollars);
        }else{
            System.out.printf("Dollars:\t\t\t %-15d\n", 0);
        }

        int changeQuarters = neededChangeWhole / 25;
        neededChangeWhole -= changeQuarters * 25;

        if(changeQuarters > 0){
            System.out.printf("Quarters:\t\t\t %-15d\n", changeQuarters);
        }else{
            System.out.printf("Quarters:\t\t\t %-15d\n", 0);
        }


        int changeDimes = neededChangeWhole / 10;
        neededChangeWhole -= changeDimes * 10;

        if(changeDimes > 0){
            System.out.printf("Dimes:\t\t\t\t %-15d\n", changeDimes);
        }else{
            System.out.printf("Dimes:\t\t\t\t %-15d\n", 0);
        }


        int changeNickels = neededChangeWhole / 5;
        neededChangeWhole -= changeNickels * 5;

        if(changeNickels > 0){
            System.out.printf("Nickels:\t\t\t %-15d\n", changeNickels);
        }else{
            System.out.printf("Nickels:\t\t\t %-15d\n", 0);
        }

        int changePennies = neededChangeWhole;
        if(changePennies > 0){
            System.out.printf("Pennies:\t\t\t %-15d\n", changePennies);
        }else{
            System.out.printf("Pennies:\t\t\t %-15d\n", 0);
        }
        System.out.println("");

//        update the register

        if (changeDollars>0){
            numberOfOneDollarBills -= changeDollars;
        }
        if (changeQuarters>0){
            numberOfQuarters -= changeQuarters;
        }
        if (changeDimes>0){
            numberOfDimes -= changeDimes;
        }
        if (changeNickels > 0) {
            numberOfNickels -= changeNickels;
        }
        if (changePennies>0){
            numberOfPennies -= changePennies;
        }












    // figure out the dollar to give back
    // hint: 965 /100 = 9 because of the int/ int
    // so you have 9 dollars
    // update the remaining change to give back
    // 965 – 900 = 65 this is the cents you need to give back
    // figure out the quarters to give back
    // YOUR CODE HERE
    // update the remaining change to give back
    // YOUR CODE HERE
    // figure out the dimes to give back
    // YOUR CODE HERE
    // update the remaining change to give back
    // YOUR CODE HERE
    // figure out the nickels to give back
    // YOUR CODE HERE
    // update the remaining change to give back
    // YOUR CODE HERE
    // figure out the pennies to give back
    // YOUR CODE HERE
    // give the change back
    // remove the dollars, quarters, dimes, nickels, pennies
    // from the register
    // Hint code:
    // numberOfOneDollarBills -= changeDollars;
    // YOUR CODE HERE
    // output to the console the change:
    // dollars, quarters, dimes, nickels, pennies
    // Hint code:
    // System.out.printf("Dollars:\t\t %-15d\n", changeDollars);
    // System.out.printf("Quaters:\t\t %-15d\n", changeQuaters);
    // YOUR CODE HERE
    }
}//end class

