package com.sparta.rb.atm;

public class App {
    public static void main(String[] args) {
        Atm atm = new Atm();
        System.out.println(atm.withdrawValue(157));
        System.out.println(atm.getAllAvailableAmounts());
    }
}
