package spring.action.chap11.hibernate.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import spring.action.chap11.hibernate.entity.User;

import java.lang.reflect.ParameterizedType;


/**
 * Created by kieren on 18/1/30.
 */
public abstract class AbstractRepository<ID extends java.io.Serializable, Entity> implements BaseReposority<ID, Entity>{


    protected Class<Entity> getEntityClass () {
        ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
        return (Class<Entity>)type.getActualTypeArguments()[1];
    }

    @Autowired
    protected SessionFactory sessionFactory;


    private Session currentSession () {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public Entity findOne (ID id) {
        return (Entity)this.currentSession().get(this.getEntityClass(),id);
    }

    @Override
    public void insert (Entity entity) {
        this.currentSession().save(entity);
    }

}
