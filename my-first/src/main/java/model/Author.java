package model;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;
@Entity
@Table(name = "Author", catalog = "mkyongdb", uniqueConstraints = {
		@UniqueConstraint(columnNames = "FIRST_NAME"),
		@UniqueConstraint(columnNames = "LAST_NAME") })

public class Author implements Serializable{
	Long id;
private String firstName;
private String LastName;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public Author(String firstName, String lastName) {
	super();
	this.firstName = firstName;
	LastName = lastName;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}



}
