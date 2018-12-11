package com.company;

public class Main {

    public static void main(String[] args) {

//        Car car = new Car();
//        car.setModel("Toyota");
//        System.out.println(car.getModel());
//        BankAccount myAccount = new BankAccount();
//        myAccount.setAccountNumber(12);
//        myAccount.setBalace(10000);
//        myAccount.withdraw(100000);
//        System.out.println(myAccount.getBalace());

        VIPCustomer eben = new VIPCustomer();
        System.out.println(eben.getCredit());


    }

//    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus){
//
//
//        if (gameOver){
//            int finalScore = score + (levelCompleted * bonus);
//            return finalScore +=1000;
//        }
//        return -1;
//    }
//
//    public static void highScorePosition(String playerName, int position){
//        System.out.printf(playerName + ", you got to position " + position);
//    }
//
//    public static int calculateHighScorePosition(int score){
//        if(score >= 1000) {
//            return 1;
//        } else if (score >= 500 && score <= 1000){
//            return 2;
//        } else if (score >= 100 && score <= 500){
//            return 3;
//        } else {
//            return 4;
//        }
//    }
//
//    public class void MegaBytesConverter(int kiloBytes) {
//        int mb = kiloBytes / 1024;
//        int kb = kiloBytes % mg;
//
//        System.out.println(kiloBytes +"KB = " + mb + "MB" + kb + "KB");
//    }

    public static boolean isLeapYear(int year){
        double r4 = year % 4;
        double r100 = year % 100;
        double r400 = year % 100;

        if (year > 9999 || year < 1){
            return false;
        } else if (r400 != 0){
            return true;
        } else if(r100 == 0){
            return false;
        } else if(r4 == 0){
            return true;
        }
        return true;
    }

}
