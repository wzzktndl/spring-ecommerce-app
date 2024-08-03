package com.wzzk.orderservice.kafka;

import com.wzzk.orderservice.customer.CustomerResponse;
import com.wzzk.orderservice.order.PaymentMethod;
import com.wzzk.orderservice.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(

        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
