package jpabook.jpashop.entity;


import jpabook.jpashop.entity.status.DeliveryStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Delivery {

    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;

    @Column
    private String city;

    @OneToOne(mappedBy = "delivery", fetch = FetchType.LAZY)
    private Order order;

}
