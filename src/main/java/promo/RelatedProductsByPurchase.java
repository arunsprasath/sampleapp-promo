package promo;

import java.math.BigInteger;

/**
 * Combnable products - Outome of analysis done on  products purhased together
 * Created by asivatha on 5/27/2017.
 */
public class RelatedProductsByPurchase {

    private String productIdOne;
    private String productIdTwo;
    private BigInteger count;
    private String rank;//Can be trans;ated to an Enum - High (>100), Low(<10), Medium(<50)

    public String getProductIdOne() {
        return productIdOne;
    }

    public void setProductIdOne(String productIdOne) {
        this.productIdOne = productIdOne;
    }

    public String getProductIdTwo() {
        return productIdTwo;
    }

    public void setProductIdTwo(String productIdTwo) {
        this.productIdTwo = productIdTwo;
    }

    public BigInteger getCount() {
        return count;
    }

    public void setCount(BigInteger count) {
        this.count = count;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
