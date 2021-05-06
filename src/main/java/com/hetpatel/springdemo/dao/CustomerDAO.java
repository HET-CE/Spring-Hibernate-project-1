package com.hetpatel.springdemo.dao;

import java.util.List;

import com.hetpatel.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);
}
