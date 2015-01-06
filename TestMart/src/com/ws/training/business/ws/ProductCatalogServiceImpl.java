package com.ws.training.business.ws;

import java.util.List;

import javax.jws.WebService;

import com.ws.training.business.ProductCatalogServiceBO;
import com.ws.training.model.Product;

@WebService(name="TestMartCatalog", portName="TestMartCatalogPort", 
	serviceName="TestMartCatalogService", targetNamespace="http://www.testmart.com",
	endpointInterface="com.ws.training.business.ws.ProductCatalogService")
public class ProductCatalogServiceImpl implements ProductCatalogService {
	
	private ProductCatalogServiceBO productCatalogServiceBO;
	
	public ProductCatalogServiceImpl() {
		productCatalogServiceBO = new ProductCatalogServiceBO();
	}
	
	@Override
	public List<String> getProductCategories() {
		return productCatalogServiceBO.getProductCategories();
	}
	
	@Override
	public List<String> getProducts(String category) {
		return productCatalogServiceBO.getProducts(category);
	}
	
	@Override
	public List<Product> getProductsV2(String category) {
		return productCatalogServiceBO.getProductsV2(category);
	} 
	
}
