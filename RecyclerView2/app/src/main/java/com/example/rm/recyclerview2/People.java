package com.example.rm.recyclerview2;

public class People {

    private String name;
    private String age;
    private int photoId;
    private String back_color;

    public People(String name, String idade, int fotoId, String back_color) {
        setName(name);
        setAge(idade);
        setPhotoId(fotoId);
        setBack_color(back_color);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public String getBack_color() { return back_color; }

    public void setBack_color(String back_color) { this.back_color = back_color; }
}
