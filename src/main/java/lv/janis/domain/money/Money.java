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

    public Money(String price) {
        int point = price.indexOf(".") + 1;
        String minor = price.substring(point);
        // raunding operation for minorUnit 
        //-------------------------------------------------------------
        int one = 0;
        if (minor.length() > 2) {
            int lim = Integer.valueOf(minor.substring(point + 2, point + 3));
            if (lim > 5) {
                one = 1;
            }
            minor = price.substring(point, point + 2);
        }
        //end of raunding; 
        //--------------------------------------------------------------

        this.minorUnit = Integer.valueOf(minor) + one;

        // no problems with majorUnit
        String major = price.substring(0, point - 1);
        this.majorUnit = Integer.valueOf(major);
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
