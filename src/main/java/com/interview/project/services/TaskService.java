package com.interview.project.services;

import com.interview.project.domain.Task;
import com.interview.project.exception.RecordNotFoundException;
import com.interview.project.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks()
    {
        List<Task> result = (List<Task>) taskRepository.findAll();

        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<Task>();
        }
    }

    public Task getTaskById(Long id) throws RecordNotFoundException
    {
        Optional<Task> employee = taskRepository.findById(id);

        if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }

    public Task createTask(Task entity)
    {
        entity = taskRepository.save(entity);

        return entity;
    }

    public Task updateTask(Task entity, Long id)
    {
        Optional<Task> employee = taskRepository.findById(entity.getId());

        if(employee.isPresent())
        {
            Task newEntity = employee.get();
            newEntity.setDescription(entity.getDescription());
            newEntity.setState(entity.getState());
            newEntity.setUserId(entity.getUserId());
            newEntity = taskRepository.save(newEntity);

            return newEntity;
        } else {
            entity = taskRepository.save(entity);

            return entity;
        }
    }

    public void deleteTaskById(Long id) throws RecordNotFoundException
    {
        Optional<Task> employee = taskRepository.findById(id);

        if(employee.isPresent())
        {
            taskRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }
}
