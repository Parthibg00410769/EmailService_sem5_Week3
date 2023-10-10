package ie.atu.SpringBootProjects.WithoutIOC;


public class UserService {
    private EmailService emailService;


    public UserService(){
        this.emailService = new EmailService();     //tight coupling
    }

    public void registerUser(String name, String email) {
        emailService.sendEmail(email, "Welcome to out platform");
    }
}
