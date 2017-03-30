package org.eightyeight.zcw.domain.universe.chronology;

import org.neo4j.ogm.annotation.NodeEntity;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.IsoChronology;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;
import java.time.temporal.ValueRange;

/**
 * Created by rickjackson on 3/25/17.
 */
@NodeEntity(label = "Date")
public final class Date {
    public static final LocalDate MIN = LocalDate.MIN;
    public static final LocalDate MAX = LocalDate.MAX;
    private LocalDate date;
    private int year;
    private int month;
    private int day;
    
    private Date(int year, int month, int dayOfMonth) {
        this.year = year;
        this.month = month;
        this.day = dayOfMonth;
    }
    
    private Date(LocalDate localDate) {
        date = localDate;
        this.year = date.getYear();
        this.month = date.getMonthValue();
        this.day = date.getDayOfMonth();
    }
    
    private Date(int year, Month month, int dayOfMonth) {
        this.year = year;
        this.month = month.getValue();
        this.day = dayOfMonth;
    }
    
    // TODO
    // Add the now methods
    
    public static Date of(int year, Month month, int dayOfMonth) {
        return create(year, month.getValue(), dayOfMonth);
    }
    
    public static Date of(int year, int month, int dayOfMonth) {
        return create(year, month, dayOfMonth);
    }
    
    public static Date ofYearDay(int year, int dayOfYear) {
        return new Date(LocalDate.ofYearDay(year, dayOfYear));
    }
    
    public static Date ofEpochDay(long epochDay) {
        return new Date(LocalDate.ofEpochDay(epochDay));
    }
    
    public static Date from(TemporalAccessor temporal) {
        return new Date(LocalDate.from(temporal));
    }
    
    public static Date parse(CharSequence text) {
        return new Date(LocalDate.parse(text));
    }
    
    public static Date parse(CharSequence text, DateTimeFormatter formatter) {
        return new Date(LocalDate.parse(text, formatter));
    }
    
    private static Date create(int year, int month, int dayOfMonth) {
        if (dayOfMonth > 28) {
            int dom = 31;
            switch (month) {
                case 2:
                    dom = (IsoChronology.INSTANCE.isLeapYear(year) ? 29 : 28);
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dom = 30;
                    break;
            }
            if (dayOfMonth > dom) {
                if (dayOfMonth == 29) {
                    throw new DateTimeException("Invalid date 'February 29' "
                                                + "as '" + year + "'is not a "
                                                + "leap year");
                } else {
                    throw new DateTimeException("Invalid date '" + Month.of(
                        month).name() + " " + dayOfMonth + "'");
                }
            }
        }
        return new Date(year, month, dayOfMonth);
    }
    
    public boolean isSupported(TemporalField field) {
        return date.isSupported(field);
    }
    
    public boolean isSupported(TemporalUnit unit) {
        return date.isSupported(unit);
    }
    
    public ValueRange range(TemporalField field) {
        return date.range(field);
    }
    
    public int get(TemporalField field) {
        return date.get(field);
    }
}
