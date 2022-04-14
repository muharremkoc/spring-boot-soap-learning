package com.soap.springbootsoapservice.client;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "customerInfo"
})
@XmlRootElement(name = "getCustomerResponse")
@Data
public class GetCustomerResponse {
    @XmlElement(required = true)
    protected CustomerInfo customerInfo;
}
