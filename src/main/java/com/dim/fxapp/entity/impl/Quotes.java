package com.dim.fxapp.entity.impl;

import com.dim.fxapp.entity.FinancialEntity;
import com.dim.fxapp.entity.converter.LocalDateTimeConverter;
import com.dim.fxapp.entity.enums.Period;
import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;


/**
 * Created by dima on 28.11.17.
 */
@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name ="quotes")
@JsonTypeName("quotes")
public class Quotes implements FinancialEntity{
    @Id
    @JsonProperty("id")
    private BigInteger id;

    private String currency;

    @Enumerated(EnumType.STRING)
    private Period period;

    @JsonFormat
        (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime data;

    private BigDecimal open;

    private BigDecimal close;

    private BigDecimal high;

    private BigDecimal low;
}
