package modernfarmer.server.farmuscommunity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@EnableDiscoveryClient
@SpringBootApplication
@EnableFeignClients
public class FarmusCommunityApplication {

    public static void main(String[] args) {
        SpringApplication.run(FarmusCommunityApplication.class, args);
    }

}
