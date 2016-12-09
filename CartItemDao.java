package com.niit.mycart.Dao;

import com.niit.mycart.model.Cart;
import com.niit.mycart.model.CartItem;

public interface CartItemDao {

	    void addCartItem(CartItem cartItem);

	    void removeCartItem(CartItem cartItem);

	    void removeAllCartItems(Cart cart);

	    CartItem getCartItemByProductId (int productId);
}


