package gumiwa.user_module_2022;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class UserModule2022Application {

    public static void main(String[] args) {
        SpringApplication.run(UserModule2022Application.class, args);
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }

}
