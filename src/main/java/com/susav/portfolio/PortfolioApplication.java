package com.susav.portfolio;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PortfolioApplication {

	public static void main(String[] args)
	{
		Dotenv dotenv= Dotenv.load();

		System.setProperty("DATASOURCE_URL", dotenv.get("DATASOURCE_URL"));
		System.setProperty("DATABASE_USER", dotenv.get("DATABASE_USER"));
		System.setProperty("DATABASE_PASSWORD", dotenv.get("DATABASE_PASSWORD"));
		System.setProperty("frontend.url", dotenv.get("FRONTEND_URL"));

		SpringApplication.run(PortfolioApplication.class, args);
	}

}
