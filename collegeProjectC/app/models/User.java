package models;

import java.util.*;
import javax.persistence.*;
import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity

@Table(name = "User")

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

@DiscriminatorColumn(name = "type")

@DiscriminatorValue("u")

public class User extends Model {
	@Id
    public String username;

    @Constraints.Required
    public String role;

    @Constraints.Required
    public String name;

    @Constraints.Required
    public String password;

    public static final Finder<Long, User> find = new Finder<>(User.class);

    public User() {
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername() {
        this.username = username;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole() {
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public void setName() {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword() {
        this.password = password;
    }

    public User authenticate() {
    	String username = "hi";
    	String password = "hi2";
    	return find.query().where().eq("username", username).eq("password", password).findUnique();
    }
}