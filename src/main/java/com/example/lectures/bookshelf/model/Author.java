package com.example.lectures.bookshelf.model;

public class Author {
    private Integer auId;
    private String name;
    private String patronymic;
    private String sname;
    private String date;
    private String biog;

    public Integer getAuId(){
        return auId;
    }
    public void setAuId(Integer auId) {
        this.auId=auId;
    }

    public String getName() {
        return name;
    }

    public void setFname(String fname) {
        this.name = name;
    }
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getSname(){
        return sname;
    }
    public void setSname(String sname){
        this.sname=sname;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }
    public  String getBiog(){
        return biog;
    }
    public void setBiog(String biog){
        this.biog=biog;
    }

}
