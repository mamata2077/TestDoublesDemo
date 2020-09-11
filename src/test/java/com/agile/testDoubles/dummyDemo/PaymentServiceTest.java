package com.agile.testDoubles.dummyDemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PaymentServiceTest {
    @Test
    public void shouldProcessPaymentSuccessfullyWithCreditCard() {
        LoggerDummy loggerDummy = new LoggerDummy();
         
        PaymentService paymentService = new PaymentService(loggerDummy);
        String  message = paymentService.processPaymentRequest(5000.00, "Credit Card");
        assertEquals("payment successful for amount: 5000.0 with Credit Card", message);
    }
    
}
