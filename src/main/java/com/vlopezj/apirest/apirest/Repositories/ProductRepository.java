package com.vlopezj.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.vlopezj.apirest.apirest.Entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long>{


}
