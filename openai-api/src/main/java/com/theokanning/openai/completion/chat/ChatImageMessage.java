package com.theokanning.openai.completion.chat;

import java.util.ArrayList;
import java.util.List;

public class ChatImageMessage extends ChatMessage {

    public ChatImageMessage(String role, String text, String imageUrl) {
        this.role = role;
        List<ChatContent> content = new ArrayList<>();
        content.add(new ChatTextContent(text));
        content.add(new ChatImageContent(imageUrl));
        this.content = content;
    }

    public ChatImageMessage(String role, String text, List<String> imageUrls) {
        this.role = role;
        List<ChatContent> content = new ArrayList<>();
        content.add(new ChatTextContent(text));
        for (String imageUrl : imageUrls) {
            content.add(new ChatImageContent(imageUrl));
        }
        this.content = content;
    }

    public ChatImageMessage(String role, String text, String imageUrl, String detail) {
        this.role = role;
        List<ChatContent> content = new ArrayList<>();
        content.add(new ChatTextContent(text));
        content.add(new ChatImageContent(imageUrl, detail));
        this.content = content;
    }

    public ChatImageMessage(String role, String text, List<String> imageUrls, String detail) {
        this.role = role;
        List<ChatContent> content = new ArrayList<>();
        content.add(new ChatTextContent(text));
        for (String imageUrl : imageUrls) {
            content.add(new ChatImageContent(imageUrl, detail));
        }
        this.content = content;
    }
}
