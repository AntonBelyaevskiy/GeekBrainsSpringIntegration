package gb.education.integration;

import gb.education.dto.WelcomeMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import java.util.logging.Logger;

@MessageEndpoint
public class WelcomeNotNullListener {

    static final String CHANNEL = "welcomeNotNullChannel";

    private static final Logger LOGGER = Logger.getLogger(WelcomeNotNullListener.class.getSimpleName());

    @ServiceActivator(inputChannel = CHANNEL)
    public void handler(WelcomeMessage message){
        LOGGER.info("HELLO " + message.getName().toUpperCase() + "!!!");
    }

}
