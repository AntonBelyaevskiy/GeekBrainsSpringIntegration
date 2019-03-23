package gb.education.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.messaging.MessageChannel;

@EnableAutoConfiguration
@EnableIntegration
@IntegrationComponentScan("gb.education.integration")
public class AppConfiguration {

    @Bean
    public MessageChannel welcomeChannel(){
        return new DirectChannel();
    }

    @Bean
    public MessageChannel welcomeMessageChannel(){
        return new DirectChannel();
    }

    @Bean
    public MessageChannel welcomeNotNullChannel(){
        return new DirectChannel();
    }

    @Bean
    public MessageChannel welcomeNullableChannel(){
        return new DirectChannel();
    }


}
