package com.kodilla.testing.shape;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;

@DisplayName("Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    @Nested
    @DisplayName("Add-Remove Test")
    class AddRemoveTest{

        @Test
        public void testAddFigure(){
            //Given
            ShapeCollector collection = new ShapeCollector();
            //When
            collection.addFigure(new Circle(5));
            //Then
            Assertions.assertEquals(1, collection.getLength());
        }

        @Test
        public void testRemoveNotExistingFigure(){
            //Given
            ShapeCollector collection = new ShapeCollector();
            //When
            boolean result = collection.removeFigure(new Circle(2));
            //Then
            Assertions.assertFalse(result);
        }

        @Test
        public void testRemoveFigure(){
            //Given
            ShapeCollector collection = new ShapeCollector();
            collection.addFigure(new Circle(2));
            //When
            boolean result = collection.removeFigure(new Circle(2));
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, collection.getLength());
        }
    }

    @Nested
    @DisplayName("Figure Info Test")
    class FigureInfoTest{

        @Test
        public void testGetFigure(){
            //Given
            Circle test = new Circle(2);
            ShapeCollector collection = new ShapeCollector();
            //When
            collection.addFigure(test);
            //Then
            Assertions.assertEquals(test, collection.getFigure(0));
        }

        @Test
        public void testShowFigures(){
            //Given
            ShapeCollector collection = new ShapeCollector();
            //When
            collection.addFigure(new Circle(2));
            collection.addFigure(new Square(2));
            String test = "Circle, Square";
            //Then
            Assertions.assertEquals(test, collection.showFigures());
        }
    }
}
