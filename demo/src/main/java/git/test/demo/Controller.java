package git.test.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String main(){

        System.out.println("Controller.main");
        System.out.println("main이다");

        return "main";
    }

    @GetMapping("/dev")
    public String dev(){
        return "dev";
    }

    @GetMapping("/hotfix")
    public String hotfix(){
        return "aaa";
    }

}
