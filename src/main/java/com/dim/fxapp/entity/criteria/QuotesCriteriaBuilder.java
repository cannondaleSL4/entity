package com.dim.fxapp.entity.criteria;

import com.dim.fxapp.entity.enums.Currency;
import com.dim.fxapp.entity.enums.Period;
import lombok.*;

import java.time.LocalDate;

/**
 * Created by dima on 07.05.18.
 */
@Builder
@Data
public class QuotesCriteriaBuilder<D extends LocalDate, C extends Currency, P extends Period> {
    @Getter(AccessLevel.NONE)
    private P period;
    private C currency;
    private D from;
    private D to;
}
