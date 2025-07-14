package uk.gov.justice.laa.swaggerui;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

  @GetMapping("/actuator/health")
  public String health() {
    return "OK";
  }
}