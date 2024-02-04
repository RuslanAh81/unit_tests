package seminars.first.hw;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.ListAssert;

public class ShopTest {
    /*
     1. Проверить, что магазин хранит верный список продуктов (количество продуктов, состав корзины)
     2. Проверить, что магазин возвращает верный самый дорого продукт getMostExpensiveProduct
     3. Проверить, что магазин возвращает верный отсортированный по цене список продуктов
    */
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.setTitle("milk");
        product1.setCost(100);
        Product product2 = new Product();
        product2.setTitle("bread");
        product2.setCost(50);
        Product product3 = new Product();
        product3.setTitle("cheese");
        product3.setCost(475);

        List<Product> products = List.of(product1, product2, product3);
        Shop shop = new Shop();
        shop.setProducts(products);

        // Тест 1: Проверяем, что магазин хранит верный список продуктов
        ListAssert<Product> productAssert = Assertions.assertThat(shop.getProducts());
        productAssert.hasSize(3);
        productAssert.extracting(Product::getTitle).containsExactly("milk", "bread", "cheese");

        // Тест 2: Проверяем корректность работы метода getMostExpensiveProduct
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();
        Assertions.assertThat(mostExpensiveProduct).isNotNull();
        Assertions.assertThat(mostExpensiveProduct.getTitle()).isEqualTo("cheese");

        // Тест 3: Проверяем корректность работы метода sortProductsByPrice
        List<Product> sortedProducts = shop.sortProductsByPrice();
        Assertions.assertThat(sortedProducts)
                .extracting(Product::getCost)
                .containsExactly(50, 100, 475);
    }

}




