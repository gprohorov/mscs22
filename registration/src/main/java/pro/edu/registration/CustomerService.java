package pro.edu.registration;
/*
  @author   george
  @project   mscs22
  @class  CustomerService
  @version  1.0.0 
  @since 10.11.22 - 12.35
*/

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public void registerOne(CustomerRegistrationRequest request){
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //TODO: check email if exist
        // TODO: check cheat
        // TODO: save to DB

    }
}
