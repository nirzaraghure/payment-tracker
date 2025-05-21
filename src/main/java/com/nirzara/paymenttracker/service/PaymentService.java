package com.nirzara.paymenttracker.service;

import com.nirzara.paymenttracker.model.Payment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {

    private final List<Payment> payments = new ArrayList<>();

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public List<Payment> getAllPayments() {
        return payments;
    }

    public double getTotalForUser(String userId) {
        return payments.stream()
                .filter(p -> p.getUserId().equals(userId))
                .mapToDouble(Payment::getAmount)
                .sum();
    }
}
