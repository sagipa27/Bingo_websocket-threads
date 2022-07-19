package com.websocktes.websocktes;

import org.attoparser.dom.Text;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class MyTextWebSocketHandler extends TextWebSocketHandler {
	int c = 0;
    private final List<WebSocketSession> sessions = new CopyOnWriteArrayList<>();

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        sessions.add(session);
        super.afterConnectionEstablished(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        sessions.remove(session);
        super.afterConnectionClosed(session, status);
    }

    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        super.handleTextMessage(session, message);
        sessions.forEach(webSocketSession -> {
        	
            try {
            	if(c==0){
            		bingo1 bn = new bingo1();
                	String y = bn.messa();
                    webSocketSession.sendMessage(new TextMessage(y));
                    c++;
            	}
                 if(c>0){
                	 bingo1 bn = new bingo1();
                 	 String x = bn.messa1();
                     webSocketSession.sendMessage(new TextMessage(x));
            	}
            
            } catch (IOException e) {
            }
        });
    }
}