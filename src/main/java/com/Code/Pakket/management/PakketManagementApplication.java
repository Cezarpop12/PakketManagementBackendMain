package com.Code.Pakket.management;

import com.Code.Pakket.management.config.RsaKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties({RsaKeyProperties.class})
@SpringBootApplication
public class PakketManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(PakketManagementApplication.class, args);
	}

}
