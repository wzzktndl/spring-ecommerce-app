package com.wzzk.orderservice.orderline;

import com.wzzk.orderservice.order.Order;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
public class OrderLine {

    @Id
    @GeneratedValue
    private Integer id;
    @ManyToOne
//  Default will be field name + "_"
    @JoinColumn(name = "")
    private Order order;
    private Integer productId;
    private double quantity;

}
