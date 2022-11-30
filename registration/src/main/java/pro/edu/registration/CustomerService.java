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

import javax.annotation.PostConstruct;

@Slf4j
@Service
public class CustomerService {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    CustomerRepository repository;

 //   @PostConstruct
    void  init(){
        Customer customer = Customer.builder()
                .id(1)
                .firstName("John")
                .lastName("Lennon")
                .email("john@beatles.org")
                .build();
        repository.save(customer);
    }

    public void registerOne(CustomerRegistrationRequest request){
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        log.info("Customer {} has been registered", customer.getFirstName());
        //TODO: check email if exist
        // TODO: save to DB
        this.save(customer);
        log.info("Customer {} has been registered", customer.getFirstName());
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
    public Customer save(Customer customer){
        Integer id = repository
                .findAll()
                .stream()
                .mapToInt(Customer::getId)
                .max()
                .orElse(0) + 1;
        customer.setId(id);
        return repository.save(customer);
    }
}
