package promo;

import java.math.BigInteger;
import java.util.Date;

/**
 * Created by asivatha on 5/27/2017.
 */
public class RelatedProductsByPrediction {

    private String productIdOne;
    private String productIdTwo;
    private PromoType context;
    private String rank;//Can be trans;ated to an Enum - High (>100), Low(<10), Medium(<50)
    private Date startDate;
    private Date endDate;

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

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public PromoType getContext() {
        return context;
    }

    public void setContext(PromoType context) {
        this.context = context;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
