package com.example.lectures.bookshelf.model;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "bnumber")
    @SequenceGenerator(name = "clientsIdSeq", sequenceName = "hibernate_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clientsIdSeq")
    private Integer bnumber;
    @Column(name = "bname")
    private String bname;
    @Column(name = "auid")
    private Integer AuId;
    @Column(name = "bcheck")
    private Boolean bcheck;


    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public Integer getBnumber() {
        return bnumber;
    }

    public void setBnumber(Integer bnumber) {
        this.bnumber = bnumber;
    }

    public Boolean getBcheck() {
        return bcheck;
    }

    public void setBcheck(Boolean bcheck) {
        this.bcheck = bcheck;
    }

    public Integer getAuId() {
        return AuId;
    }

    public void setAuid(Integer auId) {
        this.AuId = auId;
    }

}
