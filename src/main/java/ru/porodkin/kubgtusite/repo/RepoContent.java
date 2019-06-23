package ru.porodkin.kubgtusite.repo;

import org.springframework.data.repository.CrudRepository;
import ru.porodkin.kubgtusite.model.Content;

public interface RepoContent extends CrudRepository<Content, Long> {

}
