package com.sparta.rb.atm;

public class Atm {
    private int availableFifties;
    private int availableTwenties;
    private int availableTens;
    private int availableFives;
    private int availableTwos;
    private int availableOnes;

    public Atm() {
        this.availableFifties = 12;
        this.availableTwenties = 20;
        this.availableTens = 50;
        this.availableFives = 100;
        this.availableTwos = 250;
        this.availableOnes = 500;
    }

    public int getAvailableFifties() {
        return availableFifties;
    }

    public void setAvailableFifties(int availableFifties) {
        this.availableFifties = availableFifties;
    }

    public int getAvailableTwenties() {
        return availableTwenties;
    }

    public void setAvailableTwenties(int availableTwenties) {
        this.availableTwenties = availableTwenties;
    }

    public int getAvailableTens() {
        return availableTens;
    }

    public void setAvailableTens(int availableTens) {
        this.availableTens = availableTens;
    }

    public int getAvailableFives() {
        return availableFives;
    }

    public void setAvailableFives(int availableFives) {
        this.availableFives = availableFives;
    }

    public int getAvailableTwos() {
        return availableTwos;
    }

    public void setAvailableTwos(int availableTwos) {
        this.availableTwos = availableTwos;
    }

    public int getAvailableOnes() {
        return availableOnes;
    }

    public void setAvailableOnes(int availableOnes) {
        this.availableOnes = availableOnes;
    }

    public String withdrawValue(int withdrawalAmount) {

        String returnOutput = "Customer withdraws £" + withdrawalAmount;

        int fiftiesUsed = withdrawalAmount / 50;
        if (fiftiesUsed > 0) {
            returnOutput = returnOutput +  "\n" + fiftiesUsed + " x £50";
        }
        setAvailableFifties(getAvailableFifties() - fiftiesUsed);
        int remainingValue = withdrawalAmount % 50;

        if (remainingValue > 0) {
            int twentiesUsed = remainingValue / 20;
            if (twentiesUsed > 0) {
                returnOutput = returnOutput +  "\n" + twentiesUsed + " x £20";
            }
            setAvailableTwenties(getAvailableTwenties() - twentiesUsed);
            remainingValue = remainingValue % 20;

            if (remainingValue > 0) {
                int tensUsed = remainingValue / 10;
                if (tensUsed > 0) {
                    returnOutput = returnOutput +  "\n" + tensUsed + " x £10";
                }
                setAvailableTens(getAvailableTens() - tensUsed);
                remainingValue = remainingValue % 10;

                if (remainingValue > 0) {
                    int fivesUsed = remainingValue / 5;
                    if (fivesUsed > 0) {
                        returnOutput = returnOutput +  "\n" + fivesUsed + " x £5";
                    }
                    setAvailableFives(getAvailableFives() - fivesUsed);
                    remainingValue = remainingValue % 5;

                    if (remainingValue > 0) {
                        int twosUsed = remainingValue / 2;
                        if (twosUsed > 0) {
                            returnOutput = returnOutput +  "\n" + twosUsed + " x £2";
                        }
                        setAvailableTwos(getAvailableTwos() - twosUsed);
                        remainingValue = remainingValue % 2;

                        if (remainingValue > 0) {
                            returnOutput = returnOutput +  "\n" + remainingValue + " x £1";
                            setAvailableOnes(getAvailableOnes() - remainingValue);
                        }
                    }
                }
            }
        }

        return returnOutput;

    }

    public String getAllAvailableAmounts() {
        return ("Value  quantity of units" +
                "\n50\t" + getAvailableFifties() +
                "\n20\t" + getAvailableTwenties() +
                "\n10\t" + getAvailableTens() +
                "\n5\t" + getAvailableFives() +
                "\n2\t" + getAvailableTwos() +
                "\n1\t" + getAvailableOnes());
//        System.out.println("Value quantity of units");
//        System.out.println("50\t" + getAvailableFifties());
//        System.out.println("20\t" + getAvailableTwenties());
//        System.out.println("10\t" + getAvailableTens());
//        System.out.println("5\t" + getAvailableFives());
//        System.out.println("2\t" + getAvailableTwos());
//        System.out.println("1\t" + getAvailableOnes());

    }
}
