package gb.education.integration;

import gb.education.dto.TextMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import java.util.logging.Logger;

@MessageEndpoint
public class TextMessageListener {

    private static final Logger LOGGER = Logger.getLogger(TextMessageListener.class.getSimpleName());

    @ServiceActivator(inputChannel = TextMessageGateway.CHANNEL)
    public void handler(TextMessage message){
        LOGGER.info("rr: " + message.getMessage());
    }

}
