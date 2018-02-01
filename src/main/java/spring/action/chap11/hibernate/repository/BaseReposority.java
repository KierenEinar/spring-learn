package spring.action.chap11.hibernate.repository;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;

/**
 * Created by kieren on 18/1/30.
 */
public interface BaseReposority<ID extends Serializable, Entity> {

    Entity findOne (ID id);
    
    void insert (Entity entity);

}
