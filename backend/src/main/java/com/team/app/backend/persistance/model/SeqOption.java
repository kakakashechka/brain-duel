package com.team.app.backend.persistance.model;

public class SeqOption {
    private Long id;
    private Integer serial_num;
    private String text;
    private byte[] image;
    private Integer quest_id;


    public SeqOption() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSerial_num() {
        return serial_num;
    }

    public void setSerial_num(Integer serial_num) {
        this.serial_num = serial_num;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Integer getQuest_id() {
        return quest_id;
    }

    public void setQuest_id(Integer quest_id) {
        this.quest_id = quest_id;
    }
}
