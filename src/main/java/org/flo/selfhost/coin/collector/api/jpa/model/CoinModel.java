package org.flo.selfhost.coin.collector.api.jpa.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CoinModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private float value;
    private short year;
    private String nationality;
    private String description;
    private String quality;
    private short location;
}
