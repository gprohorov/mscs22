package pro.edu.registration;
/*
  @author   george
  @project   mscs22
  @class  CustomerController
  @version  1.0.0 
  @since 09.11.22 - 22.42
*/

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    CustomerService service;

    @PostMapping
    public void registerCustomer(@RequestBody CustomerRegistrationRequest registrationRequest){
      log.info("Customer request {}", registrationRequest);
      service.registerCustomer(registrationRequest);
    }
}
