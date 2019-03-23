package gb.education.integration;

import gb.education.dto.SimpleMessage;
import gb.education.dto.TextMessage;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Transformer;

import java.util.logging.Logger;

@MessageEndpoint
public class SimpleTextMessageTransformer {

    private static final Logger LOGGER = Logger.getLogger(SimpleTextMessageTransformer.class.getSimpleName());

    @Transformer(inputChannel = SimpleMessageGateway.CHANNEL, outputChannel = TextMessageGateway.CHANNEL)
    public TextMessage transform(SimpleMessage simpleMessage){
        LOGGER.info("SimpleTextMessageTransformer");
        return new TextMessage(simpleMessage.getDate().toString());
    }

}
