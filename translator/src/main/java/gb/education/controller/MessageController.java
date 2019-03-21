package gb.education.controller;

import gb.education.dto.ResultDTO;
import gb.education.dto.SimpleMessage;
import gb.education.integration.SimpleMessageGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api")
public class MessageController {

    @Autowired
    private SimpleMessageGateway simpleMessageGateway;

    @RequestMapping(value = "/ping", method = RequestMethod.GET, produces = "application/json")
    public ResultDTO ping(){
        return new ResultDTO();
    }

    @RequestMapping(value = "/transform", method = RequestMethod.GET, produces = "application/json")
    public ResultDTO send() {
        simpleMessageGateway.fire(
                MessageBuilder
                        .withPayload(new SimpleMessage())
                        .setHeader("REQ_ID", UUID.randomUUID().toString())
                        .build());
        return new ResultDTO();
    }

}
