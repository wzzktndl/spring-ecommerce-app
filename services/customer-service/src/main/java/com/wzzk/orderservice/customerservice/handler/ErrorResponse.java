package com.wzzk.orderservice.customerservice.handler;

import java.util.Map;

public record ErrorResponse (
        Map<String, String> errors
){
}
