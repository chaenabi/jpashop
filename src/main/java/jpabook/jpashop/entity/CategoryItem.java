package jpabook.jpashop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@Entity(name = "Category_Item")
public class CategoryItem {

    @Id
    private String categoryId;

}
