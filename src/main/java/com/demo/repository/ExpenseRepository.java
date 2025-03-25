package com.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.entity.ExpenseEntity;

public interface ExpenseRepository extends JpaRepository<ExpenseEntity,Long>{

}
