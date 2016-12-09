package com.niit.mycart.service;



import com.niit.mycart.model.Cart;

public interface CartService {
	
	Cart getCartById (int cartId);

    

    void update(Cart cart);

}
