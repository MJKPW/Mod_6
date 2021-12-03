package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class SecondChallengeTestSuite {
    @Test
    public void testXUpperBoundaryConditions(){
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //Then & When
        Assertions.assertThrows(IllegalArgumentException.class,
                        ()->exceptionHandling.handling(2, 1));
    }

    @Test
    public void testXBottomBoundaryConditions(){
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //Then & When
        Assertions.assertDoesNotThrow(()->exceptionHandling.handling(1, 2));
    }

    @Test
    public void testYConditions(){
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //Then & When
        Assertions.assertThrows(IllegalArgumentException.class,
                            ()->exceptionHandling.handling(1.5, 1.5));
    }

    @Test
    public void testXYMeetingConditions(){
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //Then & When
        Assertions.assertDoesNotThrow(()->exceptionHandling.handling(1.5, 1));
    }

    @Test
    public void testXYNotMeetingConditions(){
        //Given
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        //Then & When
        Assertions.assertThrows(IllegalArgumentException.class,
                                    ()->exceptionHandling.handling(3, 1.5));
    }

}
