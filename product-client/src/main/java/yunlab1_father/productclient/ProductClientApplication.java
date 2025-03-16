package yunlab1_father.productclient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication(scanBasePackages = {"yunlab1_father.productclient.controller","yunlab1_father.productclient.Client"})
@EnableEurekaClient
@EnableFeignClients("yunlab1_father.productclient.Client")


public class ProductClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductClientApplication.class, args);
    }
}