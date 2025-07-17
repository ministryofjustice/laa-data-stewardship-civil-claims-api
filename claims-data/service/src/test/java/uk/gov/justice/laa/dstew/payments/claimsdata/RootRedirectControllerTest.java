package uk.gov.justice.laa.dstew.payments.claimsdata;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.header;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import uk.gov.justice.laa.dstew.payments.claimsdata.controller.RootRedirectController;

@WebMvcTest(RootRedirectController.class)
class RootRedirectControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @Test
  void rootRedirectsToSwaggerUi() throws Exception {
    mockMvc.perform(get("/"))
        .andExpect(status().isFound()) // 302
        .andExpect(header().string("Location", "/swagger-ui/index.html"));
  }
}
