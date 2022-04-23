package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@NoArgsConstructor
@Data
@Table(name = "items")
public class Item extends BaseEntity{

    private String code;
    private String name;

    @ManyToMany(mappedBy = "itemList")
    private List<Cart> cart;

    public Item(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
