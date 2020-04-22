package jpabook.jpashop.entity;


import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class OrderItem {

    @Id @Generated
    @Column(name = "order_item_id")
    private Long id;

    @Column
    private double orderPrice;

    @Column
    private int count;

}
