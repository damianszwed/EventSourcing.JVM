package io.eventdriven.introductiontoeventsourcing.e07_application_logic.postgresql.immutable.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public
class ECommerceApplication {
  public static void main(String[] args) {
    SpringApplication.run(ECommerceApplication.class, args);
  }
}
