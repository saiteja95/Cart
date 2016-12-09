package com.niit.mycart.service;

import com.niit.mycart.model.Cart;
import com.niit.mycart.model.CartItem;

public interface CartItemService {
	
	 void addCartItem(CartItem cartItem);

	    void removeCartItem(CartItem cartItem);

	    void removeAllCartItems(Cart cart);

	    CartItem getCartItemByProductId (int productId);

}
