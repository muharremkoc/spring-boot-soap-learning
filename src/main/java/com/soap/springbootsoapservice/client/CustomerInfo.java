package com.soap.springbootsoapservice.client;


import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "customerInfo",propOrder = {
        "customerID",
        "firstName",
        "lastName",
        "identityID"
})
@Data
public class CustomerInfo {
    @XmlElement
    protected int customerID;
    @XmlElement
    protected  String firstName;
    @XmlElement
    protected  String lastName;
    @XmlElement
    protected  int identityID;


}
