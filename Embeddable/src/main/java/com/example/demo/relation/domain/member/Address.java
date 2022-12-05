package com.example.demo.relation.domain.member;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Data
@Embeddable
public class Address {

    @Column(table = "member_address")
    private String address1;

    @Column(table = "member_address")
    private String address2;

    @Column(table = "member_address")
    private String zipcode;
}
