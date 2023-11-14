package com.sparta.rb.atm;

public class App {
    public static void main(String[] args) {
        Atm atm = new Atm();
        atm.withdrawValue(157);
        atm.getAllAvailableAmounts();
    }
}
