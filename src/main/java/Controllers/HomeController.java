package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{

    @GetMapping("/hello")
    public String getStringMessage() {
        return "Hi ! You will be able to monitor health of the application !!" ;

    }
}
