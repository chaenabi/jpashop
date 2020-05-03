package jpabook.jpashop.entity;

import jpabook.jpashop.entity.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@Entity(name = "category_Item")
public class CategoryItem implements Serializable {

    //@Id
    //@GeneratedValue
    //@Column(name = "category_item_id")
    //private String id;

    @Id
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "item_id")
    private Item item;

    @Id
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CategoryItem)) return false;
        CategoryItem that = (CategoryItem) o;
        return item.equals(that.item) &&
                category.equals(that.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, category);
    }
}
