package com.niit.mycart.service;

import com.niit.mycart.model.CustomerOrder;

public interface CustomerOrderService {
	
	void addCustomerOrder(CustomerOrder customerOrder);
	
	double getCustomerOrderGrandTotal(int cartId);
}
