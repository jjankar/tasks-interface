package lv.janis.domain.cart;

import lv.janis.domain.money.Money;
import lv.janis.domain.money.MoneyInterface;
import lv.janis.domain.product.ProductInterface;
import lv.janis.domain.stock.Stock;
import org.springframework.data.annotation.Id;

/**
 *
 * @author janis
 */
public class Cart extends Stock implements CartInterface {

    @Id
    String costumerData;
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
        this.subTotal = new Money(0, 0);
        for (ProductInterface product : this.array) 
        {
            subTotal.setMajorUnit(subTotal.getMajorUnit() + product.getPrice().getMajorUnit());
            subTotal.setMinorUnit(subTotal.getMinorUnit() + product.getPrice().getMinorUnit());
        }
        int vatMinor = subTotal.getMinorUnit() % 100;
        int vatMajor = subTotal.getMinorUnit() / 100;
        subTotal.setMinorUnit(vatMinor);
        subTotal.setMajorUnit(subTotal.getMajorUnit() + vatMajor);

        return subTotal;
    }
    
    @Override
    public MoneyInterface getVatAmount() {
        this.vatAmount = new Money(0, 0);
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
        this.total = new Money(0, 0);
        int minor = (subTotal.getMinorUnit()+vatAmount.getMinorUnit())%100;
        int major = (subTotal.getMinorUnit()+vatAmount.getMinorUnit())/100;
        total.setMinorUnit(minor);
        total.setMajorUnit(this.getSubtotal().getMajorUnit() + this.getVatAmount().getMajorUnit()+major);
        return total;
    }

}
