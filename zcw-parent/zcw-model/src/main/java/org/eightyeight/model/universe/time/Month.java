package org.eightyeight.model.universe.time;

import java.time.DateTimeException;

/**
 * Created by rickjackson on 3/22/17.
 */
public enum Month {
    UNKNOWN {},
    JANUARY {},
    FEBRUARY {},
    MARCH {},
    APRIL {},
    MAY {},
    JUNE {},
    JULY {},
    AUGUST {},
    SEPTEMBER {},
    OCTOBER {},
    NOVEMBER {},
    DECEMBER {};
    
    private static final Month[] ENUMS = Month.values();
    
    public static Month of(int month) {
        if (month < 1 || month > 12) {
            throw new DateTimeException("Invalid value for MonthOfYear: "
                                        + month);
        }
        return ENUMS[month];
    }
    
    public int getValue() {
        return ordinal();
    }
    
    public Month plus(long months) {
        int amount = (int) months % 12;
        return ENUMS[(ordinal() + (amount + 12)) % 12];
    }
    
    public Month minus(long months) {
        return plus(-(months % 12));
    }
    
    public int length(boolean leapYear) {
        switch (this) {
            case FEBRUARY:
                return (leapYear ? 29 : 28);
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            default:
                return 31;
        }
    }
    
    public int minLength() {
        switch (this) {
            case FEBRUARY:
                return 28;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            default:
                return 31;
        }
    }
    
    public int maxLength() {
        switch (this) {
            case FEBRUARY:
                return 29;
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return 30;
            default:
                return 31;
        }
    }
    
    public int firstDayOfYear(boolean leapYear) {
        int leap = leapYear ? 1 : 0;
        switch (this) {
            case JANUARY:
                return 1;
            case FEBRUARY:
                return 32;
            case MARCH:
                return 60 + leap;
            case APRIL:
                return 91 + leap;
            case MAY:
                return 121 + leap;
            case JUNE:
                return 152 + leap;
            case JULY:
                return 182 + leap;
            case AUGUST:
                return 213 + leap;
            case SEPTEMBER:
                return 244 + leap;
            case OCTOBER:
                return 274 + leap;
            case NOVEMBER:
                return 305 + leap;
            case DECEMBER:
            default:
                return 335 + leap;
        }
    }
    
    public Month firstMonthOfQuarter() {
        return ENUMS[(ordinal() / 3) * 3];
    }
}
