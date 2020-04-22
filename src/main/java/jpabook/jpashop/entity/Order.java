package jpabook.jpashop.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.Generated;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class Order {

    @Id @Generated
    @Column(name = "order_id")
    private Long id;

    @Column(name = "order_date")
    @DateTimeFormat
    private Date orderDate;

    @Column
    private OrderStatus status;

    @OneToMany
    @JoinColumn(name = "member_id") // 외래키
    private Member memberId;
}

