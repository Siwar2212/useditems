package com.example.useditemsv1;

import android.widget.ImageView;

public class ImageItem {
    private ImageView image;
    private String name;

    public ImageItem(ImageView image, String name) {
        this.image = image;
        this.name = name;
    }

    public ImageItem() {
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ImageItem{" +
                "image=" + image +
                ", name='" + name + '\'' +
                '}';
    }
}
