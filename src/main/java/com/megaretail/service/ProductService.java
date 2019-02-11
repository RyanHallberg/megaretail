package com.megaretail.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.megaretail.entity.ProductEntity;

@Transactional
public class ProductService
{
	@PersistenceContext
	EntityManager entityManager;
	
	// service methods
	// get a list of all the products from the underlying database
	public List<ProductEntity> getProducts()
	{
		List<ProductEntity> products = 
				entityManager.createQuery("SELECT p FROM ProductEntity p", ProductEntity.class)
				.getResultList();
		
		return products;
	}
	
	// get a single product by ID
	public ProductEntity getProductById(Long id)
	{
		ProductEntity product = entityManager.find(ProductEntity.class, id);
		
		entityManager.detach(product);
		
		return product;
	}

}
