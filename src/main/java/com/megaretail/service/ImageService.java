package com.megaretail.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.megaretail.entity.ImageEntity;

@Transactional
public class ImageService
{
	@PersistenceContext
	EntityManager entityManager;
	
	// get a list of all product images from the database
	public List<ImageEntity> getProductImages()
	{
		List<ImageEntity> productImages =
				entityManager.createQuery("SELECT i FROM ImageEntity i", ImageEntity.class)
				.getResultList();
		
		return productImages;
	}
	
	// get a single product image by id
	public ImageEntity getProductImage(Long id)
	{
		//ImageEntity productImage = entityManager.find(ImageEntity.class, id);
		ImageEntity productImage = 
				entityManager.createQuery("SELECT i FROM ImageEntity i WHERE i.productId = " + id, ImageEntity.class)
				.getSingleResult();
				
		
		entityManager.detach(productImage);
		
		return productImage;
	}
}
