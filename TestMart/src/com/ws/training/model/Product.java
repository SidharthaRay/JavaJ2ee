package com.ws.training.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Product")
@XmlType(propOrder={"name", "sku", "price"})
public class Product {
	private String name;
	private String sku;
	private String price;
	
	public Product() {
	}

	public Product(String name, String sku, String price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	@XmlElement(name="ProductName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
