package com.dim.fxapp.entity;

import com.dim.fxapp.entity.impl.quotes.*;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.io.Serializable;

/**
 * Created by dima on 28.11.17.
 */
@JsonIdentityInfo(
        generator = ObjectIdGenerators.IntSequenceGenerator.class,
        property = "id"
)
@JsonSubTypes({ @JsonSubTypes.Type(name = "quotes", value = Quotes.class),
        @JsonSubTypes.Type(name = "AUDUSD", value = AUDUSD.class),
        @JsonSubTypes.Type(name = "EURAUD", value = EURAUD.class),
        @JsonSubTypes.Type(name = "EURGBP", value = EURGBP.class)})
public interface FinancialEntity extends Serializable {

}
