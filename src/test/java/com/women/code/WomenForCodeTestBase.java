package com.women.code;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.ConfigFileApplicationContextInitializer;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.women.code.mock.config.WomenForCodeTestConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles("test")
@ContextConfiguration(classes = {WomenForCodeTestConfig.class}, initializers = ConfigFileApplicationContextInitializer.class)
@WebAppConfiguration
public class WomenForCodeTestBase {
  @Before 
  public void setUp() {
	  MockitoAnnotations.initMocks(this);
  }
}
