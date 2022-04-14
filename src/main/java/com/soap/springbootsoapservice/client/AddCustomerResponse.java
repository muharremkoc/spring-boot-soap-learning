package com.soap.springbootsoapservice.client;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "serviceStatus",
        "customerInfo"
})
@XmlRootElement(name = "addCustomerResponse")

@Data
public class AddCustomerResponse {

    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
    @XmlElement(required = true)
    protected CustomerInfo customerInfo;

}
