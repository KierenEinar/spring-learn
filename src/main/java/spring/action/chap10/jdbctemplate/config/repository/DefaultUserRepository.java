package spring.action.chap10.jdbctemplate.config.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import spring.action.chap10.jdbctemplate.config.model.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kieren on 18/1/26.
 */
@Repository
public class DefaultUserRepository implements UserRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static final String SELECT_USER_BY_ID = "SELECT * FROM users WHERE id = ?;";

    public User findOne (Long id) {
        return jdbcTemplate.queryForObject(SELECT_USER_BY_ID, new Object[] { id }, (resultSet, i) -> {
            return new User(resultSet.getString("uuid"), resultSet.getString("name"));
        });
    }


}
