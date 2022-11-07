package com.evesga.beerserviceproject.web.domain;

import lombok.*;

import javax.persistence.Entity;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Customer {
    private UUID id;
    private String name;
}
