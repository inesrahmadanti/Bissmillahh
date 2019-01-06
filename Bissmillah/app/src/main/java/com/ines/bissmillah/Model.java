package com.ines.bissmillah;

/**
 * Created by Ines on 06/01/2019.
 */

public class Model {
    private String title, image, description;//harus sama dengan nama di firebase

    //contructor
    public Model(){}

    //getter and setter

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
