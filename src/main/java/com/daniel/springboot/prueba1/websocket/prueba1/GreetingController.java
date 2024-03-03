package com.daniel.springboot.prueba1.websocket.prueba1;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

@Controller
public class GreetingController {
    

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Greeting greeting(HelloMessage message) throws InterruptedException{
        return new Greeting("Hello " + HtmlUtils.htmlEscape(message.getName()) + "!");
    }

}
