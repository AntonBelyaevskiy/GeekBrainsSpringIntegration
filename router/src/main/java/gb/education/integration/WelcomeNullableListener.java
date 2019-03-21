package gb.education.integration;

import gb.education.dto.WelcomeMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import java.util.logging.Logger;

@MessageEndpoint
public class WelcomeNullableListener {

    static final String CHANNEL = "welcomeNullableChannel";

    private static final Logger LOGGER = Logger.getLogger(WelcomeNullableListener.class.getSimpleName());

    @ServiceActivator(inputChannel = CHANNEL)
    public void handler(WelcomeMessage message){
        LOGGER.info("HELLO UNKNOWN!");
    }

}
