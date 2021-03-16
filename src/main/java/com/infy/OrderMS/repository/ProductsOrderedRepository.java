package com.infy.OrderMS.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.OrderMS.entity.CompositeKey;
import com.infy.OrderMS.entity.ProductsOrdered;

@Repository
public interface ProductsOrderedRepository extends JpaRepository<ProductsOrdered, CompositeKey>{

}
