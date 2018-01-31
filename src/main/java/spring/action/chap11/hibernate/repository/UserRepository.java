package spring.action.chap11.hibernate.repository;

import org.springframework.stereotype.Repository;
import spring.action.chap11.hibernate.entity.User;

/**
 * Created by kieren on 18/1/30.
 */
@Repository
public class UserRepository extends AbstractRepository<Long, User> {

}
