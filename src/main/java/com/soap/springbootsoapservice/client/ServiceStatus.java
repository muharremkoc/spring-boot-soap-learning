package com.soap.springbootsoapservice.client;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceStatus", propOrder = {
        "status",
        "message"
})
@Data
public class ServiceStatus {

    @XmlElement
    protected String status;
    @XmlElement
    protected String message;

}
