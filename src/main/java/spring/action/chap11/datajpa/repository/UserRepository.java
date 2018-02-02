package spring.action.chap11.datajpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Repository;
import spring.action.chap11.datajpa.entity.User;

import javax.persistence.PersistenceContext;

/**
 * Created by kieren on 18/2/2.
 */
@PersistenceContext
public interface UserRepository extends JpaRepository<User, Long> {

}
