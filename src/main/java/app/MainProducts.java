package app;

import service.ProductsSetService;

public class MainProducts {
    public static void main(String[] args) {
        ProductsSetService productsSetService = new ProductsSetService();

        productsSetService.createProduct(3L, "Product 3", 125d, 15);
        productsSetService.createProduct(4L, "Product 4", 178d, 19);
        productsSetService.createProduct(1L, "Product 1", 10d, 5);
        productsSetService.createProduct(2L, "Product 2", 15d, 10);

        System.out.println(productsSetService.getProductsOrderedByName());
        System.out.println(productsSetService.getProductsSortedByPrice());
    }
}

