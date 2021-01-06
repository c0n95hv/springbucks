package com.example.springbucks.repository;

import com.example.springbucks.model.CoffeeOrder;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeOrderRepository extends CrudRepository<CoffeeOrder, Long> {
}
