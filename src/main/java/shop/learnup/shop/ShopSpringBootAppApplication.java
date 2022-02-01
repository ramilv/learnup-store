package shop.learnup.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class ShopSpringBootAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopSpringBootAppApplication.class, args);
    }

}
