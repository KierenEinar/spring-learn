package spring.action.chap11.hibernate.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.action.chap11.hibernate.entity.User;
import spring.action.chap11.hibernate.repository.UserRepository;
import spring.action.chap11.hibernate.service.UserService;

import java.io.Serializable;

/**
 * Created by kieren on 18/2/1.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService  {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOne(Long id) {
        return userRepository.findOne(id);
    }

}
