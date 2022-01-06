package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();

        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));

        //Then
        assertEquals(17.28*2.0, invoice.getItems().get(0).getValue(), 0.001);
        assertEquals(11.99*3.5, invoice.getItems().get(1).getValue(), 0.001);
        assertEquals(6.49*5.0, invoice.getItems().get(2).getValue(), 0.001);
        assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }
}