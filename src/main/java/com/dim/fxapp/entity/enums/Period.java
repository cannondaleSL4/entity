package com.dim.fxapp.entity.enums;

/**
 * Created by dima on 04.12.17.
 */
public enum Period {
    FIVEMINUTES ("5",3),
    FIVETEENMINUTES ("15",5),
    ONEHOUR("60",7),
    DAY ("D",8),
    WEEK ("W",9),
    MONTH ("M",10);

    private final String period;
    private final Integer timeCode;

    private Period (final String period, Integer timeParametr){
        this.timeCode =timeParametr;
        this.period = period;
    }

    public static Integer getCodeByPeriod(String periodName) {
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
