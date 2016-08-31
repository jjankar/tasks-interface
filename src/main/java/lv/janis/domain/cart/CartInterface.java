package lv.janis.domain.cart;

import lv.janis.domain.money.MoneyInterface;
import lv.janis.domain.stock.StockInterface;

/**
 *
 * @author janis
 */
public interface CartInterface extends StockInterface {

    MoneyInterface getSubtotal();

    MoneyInterface getVatAmount();

    MoneyInterface getTotal();

}
