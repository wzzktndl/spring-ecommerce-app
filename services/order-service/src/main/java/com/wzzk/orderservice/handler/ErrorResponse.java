package com.wzzk.orderservice.handler;

import java.util.Map;

public record ErrorResponse (
        Map<String, String> errors
){
}
