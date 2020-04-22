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
public class Delivery {

    @Id @Generated
    @Column(name = "delivery_id")
    private Long id;

    @Column
    private DeliveryStatus status;

    @Column
    private String city;

}
