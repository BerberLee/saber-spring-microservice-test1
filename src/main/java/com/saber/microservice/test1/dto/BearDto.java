package com.saber.microservice.test1.dto;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;
@Data
@EqualsAndHashCode
@ToString
@Builder
public class BearDto  implements Serializable {

    private UUID id;
    private Integer version;
    private OffsetDateTime createDate;
    private OffsetDateTime lastModifiedDate;
    private String bearName;
    private BearStyleEnum  bearStyleEnum;
    private BigDecimal price;

}
