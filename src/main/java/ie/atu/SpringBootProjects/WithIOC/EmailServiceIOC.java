package ie.atu.SpringBootProjects.WithIOC;

import org.springframework.stereotype.Service;

@Service
public class EmailServiceIOC {
    public void sendEmail(String email, String message){
        System.out.println("Sending email to "+ email + ":" + message);
    }
}
