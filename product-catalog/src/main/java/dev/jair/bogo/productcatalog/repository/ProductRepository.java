package dev.jair.bogo.productcatalog.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import dev.jair.bogo.productcatalog.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findByName(String name);

}
