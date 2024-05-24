package com.example.cmpp.Xmpp.model;

public class FcmModel {

    private String messageBody;
    private String messageType;
    private String counterJid;
    private String messageId;
    private String addToDB;
    private String swipeReplyID;

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getCounterJid() {
        return counterJid;
    }

    public void setCounterJid(String counterJid) {
        this.counterJid = counterJid;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getAddToDB() {
        return addToDB;
    }

    public void setAddToDB(String addToDB) {
        this.addToDB = addToDB;
    }

    public String getSwipeReplyID() {
        return swipeReplyID;
    }

    public void setSwipeReplyID(String swipeReplyID) {
        this.swipeReplyID = swipeReplyID;
    }

    @Override
    public String toString() {
        return "FcmModel{" +
                "messageBody='" + messageBody + '\'' +
                ", messageType='" + messageType + '\'' +
                ", counterJid='" + counterJid + '\'' +
                ", messageId='" + messageId + '\'' +
                ", addToDB='" + addToDB + '\'' +
                ", swipeReplyID='" + swipeReplyID + '\'' +
                '}';
    }
}
