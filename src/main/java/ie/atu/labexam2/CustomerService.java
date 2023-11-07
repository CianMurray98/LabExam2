package ie.atu.labexam2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerService {
    @PostMapping("/confirm")
    public String confirmDetails(@RequestBody UserDetails userDetails) {
        if (UserDetails.getCustomerByAge > 18) {
            String confirmationMessage = String.format("Recieved details for\n ID: %s",
                    userDetails.getCustomerById());
            return confirmationMessage;
        }
        else if (UserDetails.getCustomerByAge < 18){
            String confirmationMessage2 = String.format("You are too young to order, come back when your 18");
            return confirmationMessage2;
        }
    }
}
