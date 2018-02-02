package spring.action.chap11.hibernate.service;

import spring.action.chap11.hibernate.entity.User;
import spring.action.chap11.hibernate.repository.BaseReposority;
import spring.action.chap11.hibernate.repository.UserRepository;

/**
 * Created by kieren on 18/2/1.
 */
public interface UserService{

    User findOne (Long id);

}
