package spring.action.chap11.datajpa.service;

import spring.action.chap11.datajpa.entity.User;

/**
 * Created by kieren on 18/2/2.
 */
public interface UserService {
    User findOne (Long id);
}
