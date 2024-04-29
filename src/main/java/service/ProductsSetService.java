package service;

import model.Product;
import sorting.ComparatorByPrice;

import java.util.*;

public class ProductsSetService {
    private Set<Product> productsSet;


    public ProductsSetService() {
        this.productsSet = new HashSet<>();
    }

    public void createProduct(long sku, String productName, double unityPrice, int quantity) {
        this.productsSet.add(new Product(sku, productName, unityPrice, quantity));
    }

    public Set<Product> getProductsOrderedByName() {
        return new TreeSet<>(productsSet);
    }

    public Set<Product> getProductsSortedByPrice() {
        Set<Product> productsSortedByPrice = new TreeSet<>(new ComparatorByPrice());
        productsSortedByPrice.addAll(productsSet);
        return productsSortedByPrice;
    }

}
