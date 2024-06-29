package com.theokanning.openai.completion.chat;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChatTextContent extends ChatContent {
    private String type = "text";
    private String text;

    public ChatTextContent(String text) {
        this.text = text;
    }
}
