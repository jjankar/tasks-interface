
package lv.janis.domain.money;

/**
 *
 * @author janis
 */
public class Money implements MoneyInterface {
    
    private int minorUnit;
    private int majorUnit;

    public Money() {
    }
    
    public Money(int minorUnit, int majorUnit) {
        this.minorUnit = minorUnit;
        this.majorUnit = majorUnit;
    }
 
        /**
     * @return the minorUnit
     */
    @Override
    public int getMinorUnit() {
        return minorUnit;
    }

    /**
     * @param minorUnit the minorUnit to set
     */
    @Override
    public void setMinorUnit(int minorUnit) {
        this.minorUnit = minorUnit;
    }

    /**
     * @return the majorUnit
     */
    @Override
    public int getMajorUnit() {
        return majorUnit;
    }

    /**
     * @param majorUnit the majorUnit to set
     */
    @Override
    public void setMajorUnit(int majorUnit) {
        this.majorUnit = majorUnit;
    }
    
}
