package ru.porodkin.kubgtusite.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.porodkin.kubgtusite.model.Content;
import ru.porodkin.kubgtusite.repo.RepoContent;

import java.sql.Date;

@RestController()
public class Controller {

    private RepoContent repoContent;

    @Autowired
    public Controller(RepoContent repoContent) {
        this.repoContent = repoContent;
    }

    @GetMapping(path = "/task")
    public @ResponseBody Iterable<Content> greeting() {
        return repoContent.findAll();
    }

    @PostMapping(path = "/task/add")
    public String create(@RequestBody Content content) {

        content.setDate(new Date(System.currentTimeMillis()));

        repoContent.save(content);
        return "ОК";
    }

    @PutMapping(path = "/task/update/{id}")
    public void update(@PathVariable("id") Content contentFromDb,
                       @RequestBody Content content) {

        BeanUtils.copyProperties(content, contentFromDb, "id");
        contentFromDb.setDate(new Date(System.currentTimeMillis()));
        repoContent.save(content);
    }

    @DeleteMapping(path = "/task/delete/{id}")
    public void delete(@PathVariable("id") Content content) {
        repoContent.delete(content);
    }
}
