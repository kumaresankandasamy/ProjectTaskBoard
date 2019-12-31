package web;

import domain.ProjectTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ProjectTaskService;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/board")
@CrossOrigin
public class ProjectTaskController {
    @Autowired
    private ProjectTaskService projectTaskService;
    @PostMapping("")
    public ResponseEntity<?> addProjectTaskToBoard(@Valid  @RequestBody ProjectTask projectTask){
        ProjectTask newPT = projectTaskService.saveOrupdateProjectTask(projectTask);
        return new ResponseEntity<ProjectTask>(newPT, HttpStatus.CREATED);
    }

}
