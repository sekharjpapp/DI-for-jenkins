package com.pixeldi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
		SpringApplication.run(DiApplication.class, args);

		NightOwlDiscount nightOwlDiscount = context.getBean(NightOwlDiscount.class);
        System.out.println(nightOwlDiscount);
        System.out.println(nightOwlDiscount.getDiscount());

        CheckoutService checkoutService = context.getBean(CheckoutService.class);
        checkoutService.checkout(100.0);
	}
}
