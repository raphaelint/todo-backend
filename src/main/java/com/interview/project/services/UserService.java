package com.interview.project.services;

import com.interview.project.domain.User;
import com.interview.project.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.interview.project.exception.RecordNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers()
    {
        List<User> result = (List<User>) userRepository.findAll();

        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<User>();
        }
    }

    public User getEmployeeById(Long id) throws RecordNotFoundException
    {
        Optional<User> employee = userRepository.findById(id);

        if(employee.isPresent()) {
            return employee.get();
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }

    public User createUser(User entity)
    {
        entity = userRepository.save(entity);

        return entity;
    }

    public User updateUser(User entity, Long id)
    {
        Optional<User> employee = userRepository.findById(entity.getId());

        if(employee.isPresent())
        {
            User newEntity = employee.get();
            newEntity.setName(entity.getName());
            newEntity = userRepository.save(newEntity);

            return newEntity;
        } else {
            entity = userRepository.save(entity);

            return entity;
        }
    }

    public void deleteUserById(Long id) throws RecordNotFoundException
    {
        Optional<User> employee = userRepository.findById(id);

        if(employee.isPresent())
        {
            userRepository.deleteById(id);
        } else {
            throw new RecordNotFoundException("No employee record exist for given id");
        }
    }

}
