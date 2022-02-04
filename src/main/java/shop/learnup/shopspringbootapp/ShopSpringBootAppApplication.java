package shop.learnup.shopspringbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import shop.learnup.shopspringbootapp.aspects.Logger;
import shop.learnup.shopspringbootapp.services.MyStore;

@SpringBootApplication
public class ShopSpringBootAppApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext ctx = SpringApplication.run(ShopSpringBootAppApplication.class, args);
		ctx.getBean(MyStore.class).start();
	}
}
