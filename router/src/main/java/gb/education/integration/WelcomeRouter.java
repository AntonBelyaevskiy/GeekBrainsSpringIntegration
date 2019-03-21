package gb.education.integration;

import gb.education.dto.WelcomeMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;

@MessageEndpoint
public class WelcomeRouter {

    private static final String CHANNEL = "welcomeChannel";

    @Router(inputChannel = CHANNEL)
    public String route(WelcomeMessage message){
        if(message.getName() == null || message.getName().isEmpty())
            return WelcomeNullableListener.CHANNEL;

        return WelcomeNotNullListener.CHANNEL;
    }

}
