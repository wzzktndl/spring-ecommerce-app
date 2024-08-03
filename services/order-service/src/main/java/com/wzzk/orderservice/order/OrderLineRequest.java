package com.wzzk.orderservice.order;

public record OrderLineRequest(
        Integer id,
        Integer orderId,
        Integer productId,
        double quantity) {
}
