package dev.jair.bogo.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;

import dev.jair.bogo.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {

    Cart findByCustomerId(Integer customerId);

}
