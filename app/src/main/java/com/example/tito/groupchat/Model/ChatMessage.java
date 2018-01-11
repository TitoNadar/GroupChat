package com.example.tito.groupchat.Model;

import java.util.Date;

/**
 * Created by tito on 11/1/18.
 */

    public class ChatMessage {

        private String messageText;
        private String messageUser;
        private long messageTime;

        public ChatMessage(String messageText, String messageUser) {
            this.messageText = messageText;
            this.messageUser = messageUser;

            // Initialize to current time
            messageTime = new Date().getTime();
        }

        public ChatMessage(){

        }

        public String getMessageText() {
            return messageText;
        }

        public void setMessageText(String messageText) {
            this.messageText = messageText;
        }

        public String getMessageUser() {
            return messageUser;
        }

        public void setMessageUser(String messageUser) {
            this.messageUser = messageUser;
        }

        public long getMessageTime() {
            return messageTime;
        }

        public void setMessageTime(long messageTime) {
            this.messageTime = messageTime;
        }

}
