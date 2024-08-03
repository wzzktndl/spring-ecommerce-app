package com.wzzk.orderservice.payment;

import com.wzzk.orderservice.customer.CustomerResponse;
import com.wzzk.orderservice.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}