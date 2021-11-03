package com.example.lectures.bookshelf.model;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author {
    @Id
    @Column(name = "authorid")
    @SequenceGenerator(name = "clientsIdSeq1", sequenceName = "hibernate_sequence1", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientsIdSeq1")
    private Integer authorid;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "patronymic")
    private String patronymic;
    @Column (name = "secondname")
    private String secondname;
    @Column (name = "date")
    private String date;
    @Column(name = "biography")
    private String biog;

    public Integer getAuId(){
        return authorid;
    }
    public void setAuId(Integer auId) {
        this.authorid=auId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String fname) {
        this.firstname = firstname;
    }
    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }
    public String getSecondname(){
        return secondname;
    }
    public void setSecondname(String sname){
        this.secondname =sname;
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
