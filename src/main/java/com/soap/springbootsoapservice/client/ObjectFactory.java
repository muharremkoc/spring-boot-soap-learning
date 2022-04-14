package com.soap.springbootsoapservice.client;

import javax.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {

    public ObjectFactory() {
    }

    public AddCustomerRequest createAddCustomerRequest(){
        return new AddCustomerRequest();
    }


    public AddCustomerResponse createAddCustomerResponse(){
        return new AddCustomerResponse();
    }

    public DeleteCustomerRequest createDeleteCustomerRequest(){
        return new DeleteCustomerRequest();
    }

    public DeleteCustomerResponse createDeleteCustomerResponse(){
        return new DeleteCustomerResponse();
    }

    public GetCustomerRequest createGetCustomerRequest(){
        return new GetCustomerRequest();
    }

    public GetCustomerResponse createGetCustomerResponse(){
        return new GetCustomerResponse();
    }

    public UpdateCustomerRequest createUpdateCustomerRequest(){
        return new UpdateCustomerRequest();
    }

    public UpdateCustomerResponse createUpdateCustomerResponse(){
        return new UpdateCustomerResponse();
    }

    public CustomerInfo createCustomerInfo(){
        return new CustomerInfo();
    }

    public ServiceStatus createServiceStatus(){
        return new ServiceStatus();
    }









}
