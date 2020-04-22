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
public class Category {

    @Id @Generated
    @Column(name = "category_id")
    private Long id;

    @Column
    private String name;

}
