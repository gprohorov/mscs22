package pro.edu.registration;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/*
  @author   george
  @project   mscs22
  @class  CustomerRepository
  @version  1.0.0 
  @since 30.11.22 - 22.14
*/
@Repository
public interface CustomerRepository extends MongoRepository<Customer, Integer> {
}
