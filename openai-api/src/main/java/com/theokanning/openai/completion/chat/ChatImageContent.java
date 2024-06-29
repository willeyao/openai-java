package com.theokanning.openai.completion.chat;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class ChatImageContent extends ChatContent {
    private String type = "image_url";
    @JsonProperty("image_url")
    private ImageUrl imageUrl;

    @Data
    public static class ImageUrl {
        private String url;
        private String detail;

        public ImageUrl(String url, String detail) {
            this.url = url;
            this.detail = detail;
        }
    }

    public ChatImageContent(String imageUrl) {
        this.imageUrl = new ImageUrl(imageUrl, "auto");
    }

    public ChatImageContent(String imageUrl, String detail) {
        this.imageUrl = new ImageUrl(imageUrl, detail);
    }
}
