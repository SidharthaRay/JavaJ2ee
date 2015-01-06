package com.ws.training.business.ws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.ws.training.model.Product;

@WebService
public interface ProductCatalogService {

	@WebMethod
	public abstract List<String> getProductCategories();

	@WebMethod
	public abstract List<String> getProducts(String category);

	@WebMethod
	@WebResult(name="Product")
	public abstract List<Product> getProductsV2(String category);

}