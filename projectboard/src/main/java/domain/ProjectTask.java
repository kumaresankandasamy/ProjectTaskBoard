package domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class ProjectTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "summary cannot be blank")
    private String summmary;
    private String acceptenceCriteria;
    private String status;


    public ProjectTask() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummmary() {
        return summmary;
    }

    public void setSummmary(String summmary) {
        this.summmary = summmary;
    }

    public String getAcceptenceCriteria() {
        return acceptenceCriteria;
    }

    public void setAcceptenceCriteria(String acceptenceCriteria) {
        this.acceptenceCriteria = acceptenceCriteria;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
