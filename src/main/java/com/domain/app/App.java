package com.domain.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

import com.domain.config.AppConfig;
import com.domain.config.MongoDbConfig;
import com.domain.config.SwaggerConfig;

@SpringBootApplication
@Import({MongoDbConfig.class, AppConfig.class, SwaggerConfig.class})
public class App {

  private static final Logger logger = LoggerFactory.getLogger(App.class);
  
  public static void main(String[] args) {
    SpringApplication springApplication = new SpringApplication(App.class);
    ApplicationContext context = springApplication.run(args);
    logger.warn("Context : " + context.getId());
  }
}
