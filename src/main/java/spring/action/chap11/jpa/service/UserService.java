package spring.action.chap11.jpa.service;

import spring.action.chap11.jpa.entity.User;

/**
 * Created by kieren on 18/2/1.
 */
public interface UserService {
    User findOne (Long id);
}
