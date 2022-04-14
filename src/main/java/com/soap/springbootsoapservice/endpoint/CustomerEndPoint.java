package com.soap.springbootsoapservice.endpoint;


import com.soap.springbootsoapservice.client.*;
import com.soap.springbootsoapservice.model.Customer;
import com.soap.springbootsoapservice.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
@RequiredArgsConstructor
public class CustomerEndPoint {

    private static final String NAMESPACE_URI = "http://client.springbootsoapservice.soap.com";

    private final CustomerService customerService;

    @PayloadRoot(namespace = NAMESPACE_URI,localPart = "addCustomerRequest")
     @ResponsePayload
    public AddCustomerResponse addCustomer(@RequestPayload AddCustomerRequest request){
        AddCustomerResponse response=new AddCustomerResponse();
        ServiceStatus serviceStatus=new ServiceStatus();

        Customer customer=new Customer();
        BeanUtils.copyProperties(request.getCustomerInfo(),customer);
        customerService.addCustomer(customer);
        serviceStatus.setMessage("Content Added Successfully");
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getCustomerRequest")
    @ResponsePayload
    public GetCustomerResponse getCustomer(@RequestPayload GetCustomerRequest request) {
        GetCustomerResponse response = new GetCustomerResponse();
        CustomerInfo customerInfo = new CustomerInfo();
        BeanUtils.copyProperties(customerService.getCustomer(request.getCustomerID()), customerInfo);
        response.setCustomerInfo(customerInfo);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "deleteCustomerRequest")
    @ResponsePayload
    public DeleteCustomerResponse deleteCustomer(@RequestPayload DeleteCustomerRequest request) {
        customerService.deleteCustomer(request.getCustomerID());
        ServiceStatus serviceStatus = new ServiceStatus();

        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Deleted Successfully");
        DeleteCustomerResponse response = new DeleteCustomerResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "updateCustomerRequest")
    @ResponsePayload
    public UpdateCustomerResponse updateCustomer(@RequestPayload UpdateCustomerRequest request) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(request.getCustomerInfo(), customer);
        customerService.updateCustomer(customer);
        ServiceStatus serviceStatus = new ServiceStatus();
        serviceStatus.setStatus("SUCCESS");
        serviceStatus.setMessage("Content Updated Successfully");
        UpdateCustomerResponse response = new UpdateCustomerResponse();
        response.setServiceStatus(serviceStatus);
        return response;
    }

}
