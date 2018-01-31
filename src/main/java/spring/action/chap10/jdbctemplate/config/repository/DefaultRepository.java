package spring.action.chap10.jdbctemplate.config.repository;

/**
 * Created by kieren on 18/1/26.
 */
public interface DefaultRepository<T> {

    T findOne(Long id);

}
