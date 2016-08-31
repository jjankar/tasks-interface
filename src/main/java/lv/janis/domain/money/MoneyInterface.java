
package lv.janis.domain.money;

/**
 *
 * @author janis
 */
public interface MoneyInterface {

    /**
     * @return the majorUnit
     */
    int getMajorUnit();

    /**
     * @return the minorUnit
     */
    int getMinorUnit();

    /**
     * @param majorUnit the majorUnit to set
     */
    void setMajorUnit(int majorUnit);

    /**
     * @param minorUnit the minorUnit to set
     */
    void setMinorUnit(int minorUnit);
    
}
