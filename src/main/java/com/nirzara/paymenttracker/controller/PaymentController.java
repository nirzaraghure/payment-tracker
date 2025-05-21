package com.nirzara.paymenttracker.controller;

import com.nirzara.paymenttracker.model.Payment;
import com.nirzara.paymenttracker.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String addPayment(@RequestBody Payment payment) {
        paymentService.addPayment(payment);
        return "Payment added successfully!";
    }

    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @GetMapping("/{userId}/total")
    public double getTotalPaymentByUser(@PathVariable String userId) {
        return paymentService.getTotalForUser(userId);
    }
}
