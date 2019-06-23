package ru.porodkin.kubgtusite.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String universitySubjects;
    private String task;
    private Date date;
    private int course;

    public Content() {
    }

    public Long getId() {
        return id;
    }

    public String getTask() {
        return task;
    }

    public Date getDate() {
        return date;
    }

    public String getUniversitySubjects() {
        return universitySubjects;
    }

    public int getCourse() {
        return course;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUniversitySubjects(String universitySubjects) {
        this.universitySubjects = universitySubjects;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}
