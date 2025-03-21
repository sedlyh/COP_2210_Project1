package app;
import food.Apple;
import food.Sandwich;
import machine.Register;
import transactions.Payment;

public class Controller {
    public static void main(String[] args) {
//enter you info here
        System.out.println("=====================================================");
        System.out.println("PROGRAMMER: " + "");
        System.out.println("PANTHER ID: " + "");
        System.out.println();
        System.out.println("CLASS: \t\t COP2210 ");
        System.out.println("SECTION: \t " + "U01");
        System.out.println("SEMESTER: \t " + "SPRING 2025");
        System.out.println("CLASSTIME: \t " + "T/TH 9:30-12:15");
        System.out.println();
        System.out.println("PROJECT:  " + "Project 1");
        System.out.println("DUE:  " + "March 17, 2025, 11:59PM");
        System.out.println();
        System.out.println("CERTFICATION: \nI understand FIU's academic policies, and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person");
        System.out.println("=====================================================");
        System.out.println();

        Register register = new Register(15, 20, 10, 20, 50);

        register.cashInfo("Manager");
        register.cashInfo("Staff");

        Apple grannySmith = new Apple("Granny Smith", 1.51, 140);

        grannySmith.displayInfo();

        Payment applePayment1 = new Payment(10, 0, 0, 0, 47);

        applePayment1.displayInfo();

        register.buyApple(grannySmith, applePayment1);

        register.cashInfo("Manager");

        Apple macintosh = new Apple("Macintosh", 1.7, 150);

        macintosh.displayInfo();

        Payment applePayment2 = new Payment(0, 2, 0, 0, 0);

        applePayment2.displayInfo();

        register.buyApple(macintosh, applePayment2);

        register.cashInfo("Manager");


        Sandwich sandwich = new Sandwich(true, true, true);

        sandwich.displayInfo();

        Payment sandwichPayment1 = new Payment(5, 2, 1, 1, 2);

        sandwichPayment1.displayInfo();

        register.buySandwich(sandwich, sandwichPayment1);

        register.cashInfo("Manager");




    // create booleans




        for(int i = 0; i < 8; i++ ){
            boolean meat = true;
            boolean cheese = true;
            boolean veggies = true;
            System.out.println("=====================================================================");
            System.out.println("=====================================================================");
            if(i == 0){
                Sandwich sandwich1 = new Sandwich(meat, cheese, veggies);

                sandwich1.displayInfo();

                Payment sandwichPayment2 = new Payment(10, 0, 0, 0, 0);

                sandwichPayment2.displayInfo();

                register.buySandwich(sandwich1, sandwichPayment2);

                register.cashInfo("Manager");

            } else if(i == 1){
                Sandwich sandwich2 = new Sandwich(meat, cheese, !veggies);

                sandwich2.displayInfo();

                Payment sandwichPayment3 = new Payment(10, 0, 0, 0, 0);

                sandwichPayment3.displayInfo();

                register.buySandwich(sandwich2, sandwichPayment3);

                register.cashInfo("Manager");

            } else if (i == 2){
                Sandwich sandwich3 = new Sandwich(meat, !cheese, veggies);

                sandwich3.displayInfo();

                Payment sandwichPayment4 = new Payment(10, 0, 0, 0, 0);

                sandwichPayment4.displayInfo();

                register.buySandwich(sandwich3, sandwichPayment4);

                register.cashInfo("Manager");

            } else if (i == 3){
                Sandwich sandwich4 = new Sandwich(meat, !cheese, !veggies);

                sandwich4.displayInfo();

                Payment sandwichPayment5 = new Payment(10, 0, 0, 0, 0);

                sandwichPayment5.displayInfo();

                register.buySandwich(sandwich4, sandwichPayment5);

                register.cashInfo("Manager");

            } else if (i == 4){
                Sandwich sandwich5 = new Sandwich(!meat, cheese, veggies);

                sandwich5.displayInfo();

                Payment sandwichPayment6 = new Payment(10, 0, 0, 0, 0);

                sandwichPayment6.displayInfo();

                register.buySandwich(sandwich5, sandwichPayment6);

                register.cashInfo("Manager");

            } else if (i == 5 ){
                Sandwich sandwich6 = new Sandwich(!meat, cheese, !veggies);

                sandwich6.displayInfo();

                Payment sandwichPayment7 = new Payment(10, 0, 0, 0, 0);

                sandwichPayment7.displayInfo();

                register.buySandwich(sandwich6, sandwichPayment7);

                register.cashInfo("Manager");

            } else if (i == 6){
                Sandwich sandwich7 = new Sandwich(!meat, !cheese, veggies);

                sandwich7.displayInfo();

                Payment sandwichPayment8 = new Payment(10, 0, 0, 0, 0);

                sandwichPayment8.displayInfo();

                register.buySandwich(sandwich7, sandwichPayment8);

                register.cashInfo("Manager");

            } else if (i == 7){
                Sandwich sandwich8 = new Sandwich(!meat, !cheese, !veggies);

                sandwich8.displayInfo();

                Payment sandwichPayment9 = new Payment(10, 0, 0, 0, 0);

                sandwichPayment9.displayInfo();

                register.buySandwich(sandwich8, sandwichPayment9);

                register.cashInfo("Manager");

            }
        }
    }
}
