package product; /**
 * Created by asivatha on 5/27/2017.
 */
import java.util.*;

public class Product {

        private String productId;
        private String productName;
        private String prodDescription;
        private ProductBrand brandId;
        private double price;
        private ProductCategory productCategory;
        private List<ProductReview> listReviews;
        private List<String> availablePromotion;
        private List<Product> combinableProducts;


    public ProductCategory getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public List<String> getAvailablePromotion() {
        return availablePromotion;
    }

    public void setAvailablePromotion(List<String> availablePromotion) {
        this.availablePromotion = availablePromotion;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public ProductBrand getBrandId() {
        return brandId;
    }

    public void setBrandId(ProductBrand brandId) {
        this.brandId = brandId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public List<ProductReview> getListReviews() {
        return listReviews;
    }

    public void setListReviews(List<ProductReview> listReviews) {
        this.listReviews = listReviews;
    }
}
