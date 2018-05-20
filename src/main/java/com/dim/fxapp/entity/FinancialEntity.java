package com.dim.fxapp.entity;

import com.dim.fxapp.entity.impl.Quotes;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.io.Serializable;

/**
 * Created by dima on 28.11.17.
 */
@JsonIdentityInfo(
        generator = ObjectIdGenerators.IntSequenceGenerator.class,
        property = "id"
)
//@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
//        include = JsonTypeInfo.As.EXISTING_PROPERTY,
//        property = "clazz")
@JsonSubTypes({ @JsonSubTypes.Type(name = "quotes", value = Quotes.class) })
public interface FinancialEntity extends Serializable {

}
