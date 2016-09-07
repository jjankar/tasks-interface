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
        String minor = "0";
        String major = price;
        int point = 0;
        int one = 0;
        if (price.contains(".")) {
            point = price.indexOf(".") + 1;
            minor = price.substring(point);
            major = price.substring(0, point - 1);
            // raunding operation for minorUnit 
            //-------------------------------------------------------------

            if (minor.length() > 2) {
                int lim = Integer.valueOf(minor.substring(point + 2, point + 3));
                if (lim > 5) {
                    one = 1;
                }
                minor = price.substring(point, point + 2);
            }
            //end of raunding; 
            //--------------------------------------------------------------

        }

        this.minorUnit = Integer.valueOf(minor) + one;

        // no problems with majorUnit
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
