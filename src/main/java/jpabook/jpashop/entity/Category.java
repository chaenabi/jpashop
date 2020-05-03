package jpabook.jpashop.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
public class Category {

    @Id @GeneratedValue
    @Column(name = "category_id")
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<CategoryItem> categoryItems = new ArrayList<>();

    // 연관 관계 편의 메서드
    public void addCategoryItem(CategoryItem categoryItem) {
        categoryItems.add(categoryItem);
        categoryItem.setCategory(this);
    }


}
