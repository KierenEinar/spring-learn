package spring.action.chap11.jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.action.chap11.jpa.entity.User;
import spring.action.chap11.jpa.repository.UserRepository;
import spring.action.chap11.jpa.service.UserService;

/**
 * Created by kieren on 18/2/1.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public User findOne(Long id) {
        return repository.findOne(id);
    }

}
