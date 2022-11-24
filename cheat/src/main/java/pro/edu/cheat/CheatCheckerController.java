package pro.edu.cheat;
/*
  @author   george
  @project   mscs22
  @class  CheatCheckerController
  @version  1.0.0 
  @since 24.11.22 - 19.54
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cheat-check")
public class CheatCheckerController {

    @Autowired
    CheatCheckerService service;

    @GetMapping("/{id}")
    public CheatCheckerResponse isCheater(@PathVariable("id") Integer id){
        boolean isCheater = service.isCheater(id);
        return new CheatCheckerResponse(isCheater);
    }

}
