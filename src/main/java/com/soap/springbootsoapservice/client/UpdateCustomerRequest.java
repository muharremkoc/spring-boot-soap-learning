package com.soap.springbootsoapservice.client;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "customerInfo"
})
@XmlRootElement(name = "updateCustomerRequest")
@Data
public class UpdateCustomerRequest {



    @XmlElement
    protected CustomerInfo customerInfo;
}
