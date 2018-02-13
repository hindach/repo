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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Long id;
private String firstName;
private String LastName;
private Set<Book> categories = new HashSet<Book>(0);

@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
@JoinTable(name = "Book_Author", catalog = "mkyongdb", joinColumns = {
		@JoinColumn(name = "AUTHOR_ID", nullable = false, updatable = false) },
		inverseJoinColumns = { @JoinColumn(name = "BOOK_ID",
				nullable = false, updatable = false) })
public Set<Book> getCategories() {
	return categories;
}
public void setCategories(Set<Book> categories) {
	this.categories = categories;
}
public Author() {
	super();
}
public Author(String firstName, String lastName, Set<Book> categories) {
	super();
	this.firstName = firstName;
	LastName = lastName;
	this.categories = categories;
}
@Column(name = "FIRST_NAME", unique = true, nullable = false, length = 20)

public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
@Column(name = "LAST_NAME", unique = true, nullable = false, length = 10)
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
@Id
@GeneratedValue(strategy = IDENTITY)
@Column(name = "Author_ID", unique = true, nullable = false)
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}



}
