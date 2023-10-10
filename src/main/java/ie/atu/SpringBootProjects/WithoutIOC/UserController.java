package ie.atu.SpringBootProjects.WithoutIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private UserService us;

    public UserController(){
        us = new UserService();
    }

    @GetMapping("newUser1/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email){
        us.registerUser(name, email);
        return name + "Without IOC registered email is : " + email;

    }
}
