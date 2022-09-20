package com.sumonsarder.cse.SpringBootCRUD.repository;

import com.sumonsarder.cse.SpringBootCRUD.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
