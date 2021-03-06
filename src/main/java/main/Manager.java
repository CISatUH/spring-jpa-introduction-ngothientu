package main;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "MANAGER", schema = "PUBLIC", catalog = "MYDB")
public class Manager {
    private Integer id;
    private String firstName;
    private String lastName;
    private String department;

    @Basic
    @Column(name = "ID", nullable = true)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "FIRST_NAME", nullable = true, length = 24)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "LAST_NAME", nullable = true, length = 24)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "DEPARTMENT", nullable = true, length = 24)
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager that = (Manager) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(firstName, that.firstName) &&
                Objects.equals(lastName, that.lastName) &&
                Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, department);
    }
}
