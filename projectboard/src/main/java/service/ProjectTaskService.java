package service;

import domain.ProjectTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProjectTaskRepository;

@Service
public class ProjectTaskService {
    @Autowired
    private ProjectTaskRepository projectTaskRepository;

    public ProjectTask saveOrupdateProjectTask(ProjectTask projectTask){
        if (projectTask.getStatus() == null || projectTask.getStatus() == "") {
            projectTask.setStatus("To_Do");
        }
        return projectTaskRepository.save(projectTask);
    }
}
