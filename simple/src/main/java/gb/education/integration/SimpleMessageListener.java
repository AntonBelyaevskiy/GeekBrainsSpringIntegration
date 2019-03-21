package gb.education.integration;

import gb.education.dto.SimpleMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.messaging.handler.annotation.Header;

import java.util.logging.Logger;

@MessageEndpoint
public class SimpleMessageListener {

    private static final Logger LOGGER = Logger.getLogger(SimpleMessageGateway.class.getSimpleName());

    @ServiceActivator(inputChannel = SimpleMessageGateway.CHANNEL)
    public void handler(final SimpleMessage message, @Header("REQ_ID") final String reqId){
        LOGGER.info(reqId);
        LOGGER.info("SimpleMessage: " + message.getDate());
    }

}
