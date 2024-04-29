package model;

import lombok.Getter;
import lombok.Setter;

import java.util.Comparator;
import java.util.Objects;

@Getter
@Setter
public class Product implements Comparable<Product> {
    private long sku;
    private String name;
    private double unityPrice;
    private int quantity;


    public Product() {
    }

    public Product(long sku, String name, double unityPrice, int quantity) {
        this.sku = sku;
        this.name = name;
        this.unityPrice = unityPrice;
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getSku() == product.getSku();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getSku());
    }

    @Override
    public String toString() {
        return "Product{" +
                "sku=" + sku +
                ", name='" + name + '\'' +
                ", unityPrice=" + unityPrice +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public int compareTo(Product p) {
        return this.name.compareToIgnoreCase(p.getName());
    }
}

