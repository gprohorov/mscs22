package pro.edu.registration;
/*
  @author   george
  @project   mscs22
  @class  CustomerService
  @version  1.0.0 
  @since 09.11.22 - 22.54
*/

import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    public void registerCustomer(CustomerRegistrationRequest registrationRequest) {
        Customer customer = Customer.builder()
                .firstName(registrationRequest.firstName())
                .lastName(registrationRequest.lastName())
                .email(registrationRequest.email())
                .build();
    }
}
