package ie.atu.SpringBootProjects.RequestBody;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserControllerR {
    private final RegisterUserBody registerUserBody;

    @Autowired
    public UserControllerR(RegisterUserBody registerUserBody) {
        this.registerUserBody = registerUserBody;
    }

    @PostMapping("/register")
    public String Register(@RequestBody UserDetails userDetails){
        return registerUserBody.msg(userDetails);
    }
}
