package es.deusto.spq.server.jdo;

import javax.jdo.annotations.PersistenceCapable;

@PersistenceCapable
public class Score {

    private Subject subject;
    private User student;
    private Float score;
    private Integer id;

    public Score(Subject subject, User student, Float score, Integer id) {
        this.subject = subject;
        this.student = student;
        this.score = score;
        this.id = id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public User getStudent() {
        return student;
    }

    public void setStudent(User student) {
        this.student = student;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    

    public String toString() {
		return "Score: user name --> " + this.student.getName() + ", user surname --> " + this.student.getSurname() + ", subject -->" + this.subject
				+ ", score -->  " + this.score + "]";
	}


    
    
    


}