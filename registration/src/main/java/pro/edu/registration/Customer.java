package pro.edu.registration;
/*
  @author   george
  @project   mscs22
  @class  Customer
  @version  1.0.0 
  @since 09.11.22 - 22.37
*/

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
