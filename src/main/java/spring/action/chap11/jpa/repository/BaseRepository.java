package spring.action.chap11.jpa.repository;

/**
 * Created by kieren on 18/2/1.
 */
public interface BaseRepository<ID extends java.io.Serializable, Entity> {
    Entity findOne (ID id);
    void insert (Entity entity);
}
