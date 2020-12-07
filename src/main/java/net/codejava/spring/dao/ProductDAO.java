package net.codejava.spring.dao;

import net.codejava.spring.entity.Product;
import net.codejava.spring.model.PaginationResult;
import net.codejava.spring.model.ProductInfo;

public interface ProductDAO {
	public Product findProduct(String code);
    
    public ProductInfo findProductInfo(String code) ;
  
    
    public PaginationResult<ProductInfo> queryProducts(int page,
                       int maxResult, int maxNavigationPage  );
    
    public PaginationResult<ProductInfo> queryProducts(int page, int maxResult,
                       int maxNavigationPage, String likeName);
 
    public void save(ProductInfo productInfo);
}
