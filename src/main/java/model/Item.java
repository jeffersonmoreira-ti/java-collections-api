package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Item {
    private String description;
    private double price;

    public Item(String description) {
        this.description = description;
    }
}
