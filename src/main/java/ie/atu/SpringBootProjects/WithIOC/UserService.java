package ie.atu.SpringBootProjects.WithIOC;


import ie.atu.SpringBootProjects.WithoutIOC.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final EmailServiceIOC emailService;

    @Autowired      //constructor injection
    public UserService(EmailServiceIOC emailService){
        this.emailService = emailService;   //loose Coupling

    }
    public void registerUser(String name, String email){
        emailService.sendEmail(email, "Welcome to our platform");

    }

}
