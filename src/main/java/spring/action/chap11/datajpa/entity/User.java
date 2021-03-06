package spring.action.chap11.datajpa.entity;

import javax.persistence.*;

/**
 * Created by kieren on 18/2/2.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue()
    private Long id;

    @Column(name="name", nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
