package com.twoqubed.guava.base;

import com.google.common.base.Supplier;

import java.math.BigDecimal;

public class BigDecimals {

    public static BigDecimal sum(Iterable<Supplier<BigDecimal>> suppliers) {
        BigDecimal sum = new BigDecimal(0);
        for (Supplier<BigDecimal> supplier : suppliers) {
            sum = sum.add(supplier.get());
        }
        return sum;

    }
}
