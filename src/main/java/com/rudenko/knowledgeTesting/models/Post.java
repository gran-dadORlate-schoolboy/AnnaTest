package com.rudenko.knowledgeTesting.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post { //клас создает таблицу в бд с id,title, qestions, answer, views;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;

    private  String title, qestions, answer;
    private  int views;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getQestions() {
        return qestions;
    }

    public void setQestions(String qestions) {
        this.qestions = qestions;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }



}
