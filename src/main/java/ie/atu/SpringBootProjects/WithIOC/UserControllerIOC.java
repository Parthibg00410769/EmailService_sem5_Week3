package ie.atu.SpringBootProjects.WithIOC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerIOC {
    private final UserService userService;

    @Autowired
    public UserControllerIOC(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("getUser1/{name}/{email}")
    public String getUser(@PathVariable String name, @PathVariable String email){
        userService.registerUser(name, email);
        return name + "With IOC registered email is :" + email;
    }
}
