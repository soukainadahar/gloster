package ma.gloster.microservice;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.apache.log4j.Logger;

/**
 * The Class GlosterApplication.
 */
@EnableBatchProcessing
@SpringBootApplication
@EnableScheduling
public class GlosterApplication {

	/** The Constant logger. */
	private static final Logger logger = Logger.getLogger(GlosterApplication.class);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		logger.info("== Démarage de l'application");
		SpringApplication.run(GlosterApplication.class, args);
		logger.info("== Arrêt de l'application");
	}
}
