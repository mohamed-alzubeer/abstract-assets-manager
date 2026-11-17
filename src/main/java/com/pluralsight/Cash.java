package com.pluralsight;

import java.math.BigDecimal;
//create Cash class and inhertance/extends it , also created constructor
public class Cash extends Asset {
    public Cash(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public BigDecimal getValue() {
        return getOrignalCost();
    }
}
