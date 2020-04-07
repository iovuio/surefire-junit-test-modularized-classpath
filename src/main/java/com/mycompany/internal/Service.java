package com.mycompany.internal;

import java.util.stream.LongStream;

public class Service {
    public long firstPrimeAfter(long number) {
        return LongStream.iterate(number + 1, i -> i + 1)
                .filter(this::isPrime)
                .findFirst()
                .getAsLong();
    }

    private boolean isPrime(long number) {
        return number % 2 != 0 &&
                LongStream.iterate(3, i -> i + 2)
                        .takeWhile(i -> i * i <= number)
                        .allMatch(i -> number % i != 0);
    }
}
