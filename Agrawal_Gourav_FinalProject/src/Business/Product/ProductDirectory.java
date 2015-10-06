/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author gourav
 */
public class ProductDirectory {
    private ArrayList<Product> productList;
    
    public ProductDirectory(){
        this.productList = new ArrayList<>();
    }
    
    public ArrayList<Product> getProductList(){
        return productList;
    }
    public void setProductList(ArrayList<Product> productList){
        this.productList = productList;
    }
    
    public Product addProduct(){
        Product product = new Product();
        productList.add(product);
        return product;
    }
    
    public void removeProduct(Product product){
        productList.remove(product);
    }
    
//    public Product searchProductByID(int productID){
//        for(Product product:productList)
//        {
//            if(product.getProductID()== productID)
//            {
//                return product;
//            }
//        }
//        return null;
//    }
}
