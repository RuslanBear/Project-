package com.example.parseLogs.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity()
public class LogsEntity {

    // Id - уникальное значение записи
    @Id
    // GeneratedValue - при добавление новой записи генерирует новое значение
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String date;

    private String log;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String  getLog() {
        return log;
    }

    public void setLog(String log) {
        this.log = log;
    }

}
