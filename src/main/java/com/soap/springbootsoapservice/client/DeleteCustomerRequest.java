package com.soap.springbootsoapservice.client;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "customerID"
})
@XmlRootElement(name = "deleteCustomerRequest")
@Data
public class DeleteCustomerRequest {

    protected  int customerID;
}
