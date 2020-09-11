package com.agile.testDoubles.dummyDemo;

public class PaymentService {
    private Logger logger;
 
    public PaymentService(Logger logger) {
        this.logger = logger;
    }
 
    public String processPaymentRequest(double amount, String paymentMethod) {
        logger.append("Making payment for amount " + amount + " with "+ paymentMethod);
        //Logic to make payment
        return "payment successful for amount: "+ amount + " with "+ paymentMethod;
    }
}
