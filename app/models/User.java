package models;

import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class  User extends BaseModel{

    @Constraints.Required
    public String name;

    @Constraints.Required
    public String lastName;

    @Constraints.Required
    public String file;

    @Constraints.Required
    public String email;

    @Constraints.Required
    public String password;
}
