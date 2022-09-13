package com.spring.dallija.domain;


import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.persistence.Embeddable;

@Embeddable
@Getter
@AllArgsConstructor
public class Address {

    private String street;
    private String zipcode;

    protected Address() {
    }
}
