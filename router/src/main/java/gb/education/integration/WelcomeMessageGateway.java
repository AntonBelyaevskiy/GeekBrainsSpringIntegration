package gb.education.integration;

import gb.education.dto.WelcomeMessage;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;


@MessagingGateway(name = WelcomeMessageGateway.GATEWAY, defaultRequestChannel = WelcomeMessageGateway.CHANNEL)
public interface WelcomeMessageGateway {

    String CHANNEL = "welcomeChannel";
    String GATEWAY = "welcomeGateway";

    @Gateway
    void fire(Message<WelcomeMessage> message);

}
