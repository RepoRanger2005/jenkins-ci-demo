import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(excludeName = {
    "org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration",
    "org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration"
})
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello Preetam! The Jenkins CI/CD Pipeline was a SUCCESS!";
    }
}