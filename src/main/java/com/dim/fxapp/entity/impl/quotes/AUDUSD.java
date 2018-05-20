package com.dim.fxapp.entity.impl.quotes;

import com.dim.fxapp.entity.Quotes;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by dima on 20.05.18.
 */
@Entity
@Getter
@Builder
@AllArgsConstructor
@Table(name = "AUDUSD")
public class AUDUSD extends Quotes {
}
