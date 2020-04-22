package jpabook.jpashop.entity;

import lombok.Setter;
import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
public class Member {

    @Id @GeneratedValue
    @Column(name = "member_id")
    private Long id;

    @Column(name = "name")
    private String username;

    @Column
    private String city;

    @Column
    private String street;

    @Column
    private String zipCode;

    @ManyToOne
    private List<Order> orders;

}
