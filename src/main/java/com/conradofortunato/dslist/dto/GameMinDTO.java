package com.conradofortunato.dslist.dto;

import com.conradofortunato.dslist.entities.Game;

public class GameMinDTO {

    private Long id;
    private String title;
    private int year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){}

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
        this.title = entity.getTitle();
        this.year = entity.getYear();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }


}
