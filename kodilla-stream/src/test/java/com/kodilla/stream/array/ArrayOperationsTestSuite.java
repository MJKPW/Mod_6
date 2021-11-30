package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage(){
        //Given
        Random rnd = new Random();
        final int[] array = IntStream.range(0, 20).map(n->rnd.nextInt(20)).toArray();
        //When
        double meanExpected = (double)IntStream.of(array).sum() / array.length;
        //Then
        Assertions.assertEquals(meanExpected, ArrayOperations.getAverage(array) , 0.001);
    }
}
