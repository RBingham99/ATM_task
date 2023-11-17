package com.sparta.rb.atm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AtmTest {

    @Test
    public void check157ReturnsCorrectOutput() {
        Atm atm = new Atm();
        Assertions.assertEquals("Customer withdraws £157\n" +
                "3 x £50\n" +
                "1 x £5\n" +
                "1 x £2", atm.withdrawValue(157));
    }
}
