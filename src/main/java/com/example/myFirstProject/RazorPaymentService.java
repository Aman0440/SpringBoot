package com.example.myFirstProject;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "payment.provider", havingValue="razorpay")
public class RazorPaymentService implements PaymentService{
    @Override
    public String pay() {
        String payment = "Razor Payment";
        System.out.println("Payment From : " + payment);
        return payment;
    }
}
