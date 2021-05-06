package com.example.parseLogs.repo;

import com.example.parseLogs.models.LogsEntity;
import org.springframework.data.repository.CrudRepository;

public interface LogsRepository extends CrudRepository<LogsEntity, Long> {

}
