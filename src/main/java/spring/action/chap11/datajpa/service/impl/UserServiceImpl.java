package spring.action.chap11.datajpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import spring.action.chap11.datajpa.entity.User;
import spring.action.chap11.datajpa.service.UserService;
import spring.action.chap11.datajpa.repository.UserRepository;
/**
 * Created by kieren on 18/2/2.
 */
@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public User findOne(Long id) {
        return userRepository.getOne(id);
    }
}
