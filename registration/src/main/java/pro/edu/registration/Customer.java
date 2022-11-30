package pro.edu.registration;
/*
  @author   george
  @project   mscs22
  @class  Customer
  @version  1.0.0 
  @since 10.11.22 - 12.22
*/

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class Customer {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
