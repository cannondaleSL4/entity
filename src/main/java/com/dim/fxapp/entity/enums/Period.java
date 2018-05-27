package com.dim.fxapp.entity.enums;

/**
 * Created by dima on 04.12.17.
 */
public enum Period {
    FIVEMINUTES ("5m",3),
    FIVETEENMINUTES ("15m",5),
    ONEHOUR("1h",7),
    DAY ("1d",8),
    WEEK ("1w",9),
    MONTH ("1mo",10);

    private final String period;
    private final Integer timeCode;

    private Period (final String period, Integer timeParametr){
        this.timeCode =timeParametr;
        this.period = period;
    }

    public static Integer getCodeByPerios(String periodName) {
        for(Period e : values()) {
            if(e.period.equals(periodName)) return e.timeCode;
        }
        return 0;
    }

    @Override
    public String toString(){
        return period;
    }
}
