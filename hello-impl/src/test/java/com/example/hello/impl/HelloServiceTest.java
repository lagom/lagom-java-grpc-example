package com.example.hello.impl;

import com.example.hello.api.HelloService;
import org.junit.Test;

import static com.lightbend.lagom.javadsl.testkit.ServiceTest.defaultSetup;
import static com.lightbend.lagom.javadsl.testkit.ServiceTest.withServer;
import static java.util.concurrent.TimeUnit.SECONDS;
import static org.junit.Assert.assertEquals;

public class HelloServiceTest {

  @Test
  public void shouldSayHelloUsingALagomClient() throws Exception {
    withServer(defaultSetup(), server -> {
      HelloService service = server.client(HelloService.class);

      String msg = service.hello("Alice").invoke().toCompletableFuture().get(5, SECONDS);
      assertEquals("Hi Alice!", msg);
    });
  }

}
