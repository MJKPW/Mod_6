package com.kodilla.testing.collection;

import com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@DisplayName("Collection Test Suite")
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("Currently");
    }

    @AfterEach
    public void after(){
        System.out.println("Finished");
    }

    @DisplayName("Testing behavior of an empty list")
    @Test
    public void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        List<Integer> list = new LinkedList<>();
        //When
        list = test.exterminate(list);
        System.out.println("Checking if empty");
        //Then
        Assertions.assertTrue(list.isEmpty());
    }

    @DisplayName("Testing if odd numbers are eliminated")
    @Test
    public void testOddNumbersExterminatorNormalList(){
        //Given
        Integer[] numbers = {0, 1, 2, 3, 4, 5, 6};
        List<Integer> list = new LinkedList<>();
        list = Arrays.asList(numbers);
        OddNumbersExterminator test = new OddNumbersExterminator();
        //When
        list = test.exterminate(list);
        System.out.println("Checking if odd numbers are removed");
        //Then
        Assertions.assertEquals(4, list.size());
    }
}
