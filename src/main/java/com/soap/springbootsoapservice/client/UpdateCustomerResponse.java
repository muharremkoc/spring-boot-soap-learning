package com.soap.springbootsoapservice.client;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "serviceStatus"
})
@XmlRootElement(name = "updateCustomerResponse")
@Data
public class UpdateCustomerResponse {
    @XmlElement
    protected ServiceStatus serviceStatus;
}
