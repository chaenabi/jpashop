package jpabook.jpashop.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Item {

    @Id
    @Generated
    private Long id;

}

@Getter
@Setter
@Entity
class Album extends Item {
    private String artist;
}

@Getter
@Setter
@Entity
class Book extends Item {
    private String author;
}

@Getter
@Setter
@Entity
class Movie extends Item {
    private String director;
}