package ibf2022.ssf.randomnumber;

import java.util.Collections;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RandomNumberApplication {

	public static void main(String[] args) {
		// SpringApplication.run(RandomNumberApplication.class, args);

		SpringApplication app = new SpringApplication(RandomNumberApplication.class);
		String port = "3000";
		ApplicationArguments cliOpts = new DefaultApplicationArguments(args);
		if (cliOpts.containsOption("port")) {
			port = cliOpts.getOptionValues("port").get(0); // get the first value
		}
		app.setDefaultProperties(
				Collections.singletonMap("server.port", port));
		System.out.printf("Application started on port %s\n", port);
		app.run(args);
	}

}
