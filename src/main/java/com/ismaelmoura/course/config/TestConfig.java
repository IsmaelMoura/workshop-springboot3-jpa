package com.ismaelmoura.course.config;

import com.ismaelmoura.course.entities.Category;
import com.ismaelmoura.course.entities.Order;
import com.ismaelmoura.course.entities.Product;
import com.ismaelmoura.course.entities.User;
import com.ismaelmoura.course.entities.enums.OrderStatus;
import com.ismaelmoura.course.respositories.CategoryRepository;
import com.ismaelmoura.course.respositories.OrderRepository;
import com.ismaelmoura.course.respositories.ProductRepository;
import com.ismaelmoura.course.respositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Category category1 = new Category(null, "Eletronics");
        Category category2 = new Category(null, "Books");
        Category category3 = new Category(null, "Computers");

        Product product1 = new Product(null,
                "The Lord of the Rings",
                "Lorem ipsum dolor sit amet, consectetur.",
                new BigDecimal("90.5"),
                "");

        Product product2 = new Product(null,
                "Smart TV",
                "Nulla eu imperdiet purus. Maecenas ante.",
                new BigDecimal("2190.0"),
                "");

        Product product3 = new Product(null,
                "Macbook Pro",
                "Nam eleifend maximus tortor, at mollis.",
                new BigDecimal("1250.0"),
                "");

        Product product4 = new Product(null,
                "PC Gamer",
                "Donec aliquet odio ac rhoncus cursus.",
                new BigDecimal("1200.0"),
                "");

        Product product5 = new Product(null,
                "Rails for Dummies",
                "Cras fringilla convallis sem vel faucibus.",
                new BigDecimal("100.99"),
                "");

        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));
        productRepository.saveAll(Arrays.asList(product1, product2, product3, product4, product5));

        User user1 = new User(null,
                "Maria Brown",
                "maria@gmail.com",
                "988888888",
                "123456");
        User user2 = new User(null,
                "Alex Green",
                "alex@gmail.com",
                "977777777",
                "123456");

        Order order1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, user1);
        Order order2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, user2);
        Order order3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, user1);

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
    }
}
