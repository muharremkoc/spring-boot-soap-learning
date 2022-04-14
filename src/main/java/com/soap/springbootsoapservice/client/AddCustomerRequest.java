package com.soap.springbootsoapservice.client;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "customerInfo"
})
@XmlRootElement(name = "addCustomerRequest")
@Data
public class AddCustomerRequest {

    @XmlElement(required = true)
    protected  CustomerInfo customerInfo;

}
