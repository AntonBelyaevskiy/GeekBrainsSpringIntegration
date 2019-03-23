package gb.education.integration;

import gb.education.dto.SimpleMessage;
import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.messaging.Message;

@MessagingGateway(name = SimpleMessageGateway.GATEWAY, defaultRequestChannel = SimpleMessageGateway.CHANNEL)
public interface SimpleMessageGateway {

    String CHANNEL = "simpleMessageChannel";
    String GATEWAY = "simpleMessageGateway";

    @Gateway
    void fire(Message<SimpleMessage> message);

}
