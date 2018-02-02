package spring.action.chap11.jpa.repository;

import spring.action.chap11.hibernate.repository.BaseReposority;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;

/**
 * Created by kieren on 18/2/1.
 */
public abstract class AbstractRepository<ID extends java.io.Serializable, Entity> implements BaseReposority<ID, Entity> {

    protected Class<Entity> getEntityClass () {
        ParameterizedType type = (ParameterizedType)this.getClass().getGenericSuperclass();
        return (Class<Entity>)type.getActualTypeArguments()[1];
    }

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Entity findOne(ID id) {
        return entityManager.find(getEntityClass(), id);
    }

    @Override
    public void insert(Entity entity) {

    }
}
