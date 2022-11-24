package pro.edu.cheat;
/*
  @author   george
  @project   mscs22
  @class  CheatCheckerService
  @version  1.0.0 
  @since 24.11.22 - 19.53
*/

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CheatCheckerService {

    public boolean isCheater(Integer id){
    log.info("Checking {} id", id);
    if (id > 5) return true;
        return false;
    }
}
