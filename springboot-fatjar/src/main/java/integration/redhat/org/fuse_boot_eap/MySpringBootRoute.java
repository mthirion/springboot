package integration.redhat.org.fuse_boot_eap;


import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.boot.FatJarRouter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MySpringBootRoute extends FatJarRouter {

    @Override
    public void configure() {
        from("timer://myTimer?fixedRate=true&period=2000&repeatCount=10")
        .bean("myBean", "writeMessage")
        .log("the camel spring boot Fat Jar app is running");

    }


}
