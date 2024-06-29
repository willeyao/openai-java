package com.theokanning.openai.completion.chat;

import java.util.List;

public class ChatTextMessage extends ChatMessage {

    public ChatTextMessage(String role, String text) {
        this.role = role;
        this.content = List.of(new ChatTextContent(text));
    }

    public ChatTextMessage(String role, String text, String name) {
        this.role = role;
        this.content = List.of(new ChatTextContent(text));
        this.name = name;
    }
}
