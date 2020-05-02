package com.hanup.repository;

import com.hanup.entity.Customer;

public interface CustomerRepository {
    public Customer findById(long id);
}
