package com.iranna.EcommerceBackend;

import com.iranna.EcommerceBackend.models.Category;
import com.iranna.EcommerceBackend.models.Product;
import com.iranna.EcommerceBackend.repository.CategoryRepository;
import com.iranna.EcommerceBackend.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataSeeder implements CommandLineRunner {

    private final CategoryRepository categoryRepository;

    private final ProductRepository productRepository;

    public DataSeeder(CategoryRepository categoryRepository, ProductRepository productRepository) {
        this.categoryRepository = categoryRepository;
        this.productRepository = productRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        Category electronics = new Category();
        electronics.setName("Electronics");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and kitchen");

        categoryRepository.saveAll(List.of(electronics, clothing, home));

        Product phone = new Product();
        phone.setName("Smartphone");
        phone.setDescription("Latest Model Smart Phone with Amazing Features");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(1000.0);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("Latest Model Laptop with Amazing Features");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(2000.0);
        laptop.setCategory(electronics);

        Product shirt = new Product();
        shirt.setName("Shirt");
        shirt.setDescription("Latest Model Shirt with Amazing Features");
        shirt.setImageUrl("https://placehold.co/600x400");
        shirt.setPrice(50.0);
        shirt.setCategory(clothing);

        Product bedsheet = new Product();
        bedsheet.setName("Bedsheet");
        bedsheet.setDescription("Latest Model Bedsheet with Amazing Features");
        bedsheet.setImageUrl("https://placehold.co/600x400");
        bedsheet.setPrice(20.0);
        bedsheet.setCategory(home);

        productRepository.saveAll(List.of(phone, laptop, shirt, bedsheet));


    }



}
