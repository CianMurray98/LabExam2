package ie.atu.labexam2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class LabExam2Application {

    public static void main(String[] args) {
        SpringApplication.run(LabExam2Application.class, args);
    }

}
