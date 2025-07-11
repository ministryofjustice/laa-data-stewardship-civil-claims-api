package uk.gov.justice.laa.dstew.payments.claimsdata.controller;

import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Root redirection to Swagger documentation.
 */
@Controller
public class RootRedirectController {

  @GetMapping("/")
  public void redirectToSwagger(HttpServletResponse response) throws IOException {
    response.sendRedirect("/swagger-ui/index.html");
  }
}
