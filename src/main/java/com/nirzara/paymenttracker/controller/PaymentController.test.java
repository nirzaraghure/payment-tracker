package com.nirzara.paymenttracker;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nirzara.paymenttracker.controller.PaymentController;
import com.nirzara.paymenttracker.model.Payment;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(PaymentController.class)
public class PaymentControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    void addValidPayment_returnsSuccessMessage() throws Exception {
        // Create a valid payment object
        Payment payment = new Payment();
        payment.setUserId("user1");
        payment.setAmount(500);

        mockMvc.perform(post("/payments")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(payment)))
                .andExpect(status().isOk()); // Expect a 200 OK status code
    }
}