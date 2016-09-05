package lv.janis.domain.cart;

import java.util.Date;
import lv.janis.domain.money.Money;
import lv.janis.domain.money.MoneyInterface;
import lv.janis.domain.product.ProductInterface;
import lv.janis.domain.stock.Stock;
import org.apache.tomcat.jni.Time;
import org.springframework.data.annotation.Id;

/**
 *
 * @author janis
 */
public class Cart extends Stock implements CartInterface {

    @Id
    private String costumer;
    private Date date;
    private Time time;
    private MoneyInterface subTotal;
    private MoneyInterface vatAmount;
    private MoneyInterface total;

    public Cart() {
    }

    public Cart(ProductInterface[] array) {
        super(array);
    }

    @Override
    public MoneyInterface getSubtotal() {
        this.setSubTotal(new Money(0, 0));
        for (ProductInterface product : this.array) 
        {
            getSubTotal().setMajorUnit(getSubTotal().getMajorUnit() + product.getPrice().getMajorUnit());
            getSubTotal().setMinorUnit(getSubTotal().getMinorUnit() + product.getPrice().getMinorUnit());
        }
        int vatMinor = getSubTotal().getMinorUnit() % 100;
        int vatMajor = getSubTotal().getMinorUnit() / 100;
        getSubTotal().setMinorUnit(vatMinor);
        getSubTotal().setMajorUnit(getSubTotal().getMajorUnit() + vatMajor);

        return getSubTotal();
    }
    
    @Override
    public MoneyInterface getVatAmount() {
        this.setVatAmount(new Money(0, 0));
        for (ProductInterface product : this.array) 
        {
            int totalCents = product.getPrice().getMajorUnit() * 100 + product.getPrice().getMinorUnit();
            int vatMinor = (int) ((totalCents * product.getVatRate()) % 100);
            int vatMajor = (int) ((totalCents * product.getVatRate()) / 100);
            vatAmount.setMajorUnit(vatAmount.getMajorUnit() + vatMajor);
            vatAmount.setMinorUnit(vatAmount.getMinorUnit() + vatMinor);
        }
        return vatAmount;
    }

    @Override
    public MoneyInterface getTotal() {
        this.setTotal(new Money(0, 0));
        int minor = (getSubTotal().getMinorUnit()+vatAmount.getMinorUnit())%100;
        int major = (getSubTotal().getMinorUnit()+vatAmount.getMinorUnit())/100;
        total.setMinorUnit(minor);
        total.setMajorUnit(this.getSubtotal().getMajorUnit() + this.getVatAmount().getMajorUnit()+major);
        return total;
    }

    /**
     * @return the costumerData
     */
    public String getCostumerData() {
        return costumer;
    }

    /**
     * @param costumerData the costumerData to set
     */
    public void setCostumerData(String costumer) {
        this.costumer = costumer;
    }

    /**
     * @return the subTotal
     */
    public MoneyInterface getSubTotal() {
        return subTotal;
    }

    /**
     * @param subTotal the subTotal to set
     */
    public void setSubTotal(MoneyInterface subTotal) {
        this.subTotal = subTotal;
    }

    /**
     * @param vatAmount the vatAmount to set
     */
    public void setVatAmount(MoneyInterface vatAmount) {
        this.vatAmount = vatAmount;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(MoneyInterface total) {
        this.total = total;
    }

    /**
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return the time
     */
    public Time getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Time time) {
        this.time = time;
    }

}
