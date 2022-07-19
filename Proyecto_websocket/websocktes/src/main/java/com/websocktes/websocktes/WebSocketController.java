package com.websocktes.websocktes;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebSocketController {
	

    @RequestMapping("/websocket")
    public String getWebSocket() {
        return "ws-broadcast";
    }
}
