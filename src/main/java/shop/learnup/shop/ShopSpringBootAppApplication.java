package shop.learnup.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import shop.learnup.shop.services.MyStore;

@SpringBootApplication
public class ShopSpringBootAppApplication {

	public static void main(String[] args) {
		final ConfigurableApplicationContext ctx = SpringApplication.run(ShopSpringBootAppApplication.class, args);
		ctx.getBean(MyStore.class).start(ctx);
	}

}
