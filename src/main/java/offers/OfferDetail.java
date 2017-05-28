package offers;

import java.util.Date;

/**
 * Created by asivatha on 5/27/2017.
 */
public class OfferDetail {

    private String offerId;
    private String offerType;//Brand/Category/Product/Amount/Flat
    private String offeringEntity;//Issuer/Manufacturer/Retailer/ecommerce platform
    private String Offerer; //SBI/Samsung/WSRetailer/Flipkart
    private int offerInPerc;
    private double minTraxn;
    private double maxCashBack;
    private Date startDate;
    private Date endDate;

    public double getMaxCashBack() {
        return maxCashBack;
    }

    public void setMaxCashBack(double maxCashBack) {
        this.maxCashBack = maxCashBack;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }

    public String getOfferingEntity() {
        return offeringEntity;
    }

    public void setOfferingEntity(String offeringEntity) {
        this.offeringEntity = offeringEntity;
    }

    public String getOfferer() {
        return Offerer;
    }

    public void setOfferer(String offerer) {
        Offerer = offerer;
    }

    public int getOfferInPerc() {
        return offerInPerc;
    }

    public void setOfferInPerc(int offerInPerc) {
        this.offerInPerc = offerInPerc;
    }

    public double getMinTraxn() {
        return minTraxn;
    }

    public void setMinTraxn(double minTraxn) {
        this.minTraxn = minTraxn;
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
