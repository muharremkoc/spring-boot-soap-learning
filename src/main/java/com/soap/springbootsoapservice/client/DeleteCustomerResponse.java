package com.soap.springbootsoapservice.client;

import lombok.Data;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "serviceStatus"
})
@XmlRootElement(name = "deleteCustomerResponse")
@Data
public class DeleteCustomerResponse {
    @XmlElement(required = true)
    protected ServiceStatus serviceStatus;
}
