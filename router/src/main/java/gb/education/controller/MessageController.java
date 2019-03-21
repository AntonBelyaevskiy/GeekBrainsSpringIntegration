package gb.education.controller;

import gb.education.dto.ResultDTO;
import gb.education.dto.WelcomeMessage;
import gb.education.integration.WelcomeMessageGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private WelcomeMessageGateway welcomeMessageGateway;

    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = "application/json")
    public ResultDTO ping() {
        return new ResultDTO();
    }

    @RequestMapping(value = "/welcome", method = RequestMethod.GET, produces = "application/json")
    public ResultDTO welcome(@RequestParam(name = "name") String name) {
        welcomeMessageGateway.fire(
                MessageBuilder.withPayload(new WelcomeMessage(name)).build()
        );
        return new ResultDTO();
    }

}
