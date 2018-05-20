package com.dim.fxapp.entity;

import com.dim.fxapp.entity.converter.LocalDateTimeConverter;
import com.dim.fxapp.entity.enums.Period;
import com.fasterxml.jackson.annotation.*;
import lombok.Getter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


/**
 * Created by dima on 28.11.17.
 */
//@Entity
//@Getter
//@Builder
//@AllArgsConstructor
//@NoArgsConstructor
//@Table(name ="quotes")
@MappedSuperclass
@JsonTypeName("quotes")
public abstract class Quotes implements FinancialEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter
    @JsonProperty("id")
    private Integer id;

    @Column(name="currency", nullable = false)
    private String currency;

    @Column(name="period", nullable = false)
    @Enumerated(EnumType.STRING)
    private Period period;

    @Column(name = "data", nullable = false)
    @JsonFormat
        (shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm")
    @Convert(converter = LocalDateTimeConverter.class)
    private LocalDateTime data;

    @Column(name="open", nullable = false)
    private BigDecimal open;

    @Column(name="close", nullable = false)
    private BigDecimal close;

    @Column(name="high", nullable = false)
    private BigDecimal high;

    @Column(name="low", nullable = false)
    private BigDecimal low;
}
