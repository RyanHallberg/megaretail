package com.megaretail.entity;

import java.math.BigDecimal;

//import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class ProductEntity
{
	@Id
	@Column(name="product_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "product_name")
	private String name;
	
	@Column(name = "product_description")
	private String description;
	
	@Column(name = "product_price")
	private BigDecimal price;
	
	@Column(name = "product_quantity_on_hand")
	private int quantityOnHand;
	
	@Column(name = "product_department")
	private String category;
	
//	@Column(name = "product_image")
//	@Lob
//	@Basic(fetch = FetchType.EAGER)
//	private Byte[] image;

//	public Byte[] getImage()
//	{
//		return image;
//	}
//
//	public void setImage(Byte[] image)
//	{
//		this.image = image;
//	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public BigDecimal getPrice()
	{
		return price;
	}

	public void setPrice(BigDecimal price)
	{
		this.price = price;
	}

	public int getQuantityOnHand()
	{
		return quantityOnHand;
	}

	public void setQuantityOnHand(int quantityOnHand)
	{
		this.quantityOnHand = quantityOnHand;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}
	
	
	

}
