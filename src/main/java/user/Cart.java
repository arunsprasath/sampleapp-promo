package user;

import offers.PurchaseAmountOffers;
import product.Product;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by asivatha on 5/27/2017.
 */
public class Cart {

    private List<Product> productList;
    private BigDecimal cartAmount;
    private List<PurchaseAmountOffers> offers;
}
