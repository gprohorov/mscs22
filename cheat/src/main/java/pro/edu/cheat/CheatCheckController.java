package pro.edu.cheat;
/*
  @author   george
  @project   mscs22
  @class  CheatCheckController
  @version  1.0.0 
  @since 24.11.22 - 18.35
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/cheat-check")
public class CheatCheckController {

    @Autowired
    CheatCheckService service;

    @GetMapping("/{id}")
    public CheatCheckResponse isCheater(@PathVariable("id") Integer id){
        boolean isCheater = service.isCheater(id);
        return new CheatCheckResponse(isCheater);
    }
}
