package com.example.myFirstProject;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "Payment.provider", havingValue ="Stripe")
public class StripePaymentService implements PaymentService {
    @Override
    public String pay() {
        String payment = "Stripe Payment";
        System.out.println("Payment From : " + payment);
        return "Payment done";
    }
}
