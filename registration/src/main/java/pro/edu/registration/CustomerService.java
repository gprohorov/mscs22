package pro.edu.registration;
/*
  @author   george
  @project   mscs22
  @class  CustomerService
  @version  1.0.0 
  @since 10.11.22 - 12.35
*/

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class CustomerService {

    @Autowired
    RestTemplate restTemplate;

    public void registerOne(CustomerRegistrationRequest request){
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        log.info("Customer {} has been registered", customer.getFirstName());

        //TODO: check email if exist
        // TODO: save to DB
        customer.setId(7);
        // TODO: check cheat
        CheatCheckerResponse response = restTemplate
                .getForObject(
                        "http://localhost:8081/api/v1/cheat-check/{id}",
                        CheatCheckerResponse.class,
                        customer.getId()
                );
        if (response.isCheater()){
            log.info("CHEATER!!!!!!");
        }else{
            log.info("Good man");
        }

    }
}
