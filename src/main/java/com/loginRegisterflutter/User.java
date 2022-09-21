package com.loginRegisterflutter;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.validation.constraints.NotBlank;
//import java.util.Objects;
//
//@Entity
//@Table(name = "users")
//public class User {
//	private @Id @GeneratedValue long id;
//	private @NotBlank String firstname;
//	private @NotBlank String lastname;
//	private @NotBlank String email;
//	private @NotBlank String password;
//	private @NotBlank boolean loggedIn;
//
//	public User() {
//	}
//
//	public long getId() {
//		return id;
//	}
//
//	public User(long id, @NotBlank String firstname, @NotBlank String lastname, @NotBlank String email,
//			@NotBlank String password, @NotBlank boolean loggedIn) {
//		super();
//		this.id = id;
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.email = email;
//		this.password = password;
//		this.loggedIn = loggedIn;
//	}
//
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + ((email == null) ? 0 : email.hashCode());
//		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
//		result = prime * result + (int) (id ^ (id >>> 32));
//		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
//		result = prime * result + (loggedIn ? 1231 : 1237);
//		result = prime * result + ((password == null) ? 0 : password.hashCode());
//		return result;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		User other = (User) obj;
//		if (email == null) {
//			if (other.email != null)
//				return false;
//		} else if (!email.equals(other.email))
//			return false;
//		if (firstname == null) {
//			if (other.firstname != null)
//				return false;
//		} else if (!firstname.equals(other.firstname))
//			return false;
//		if (id != other.id)
//			return false;
//		if (lastname == null) {
//			if (other.lastname != null)
//				return false;
//		} else if (!lastname.equals(other.lastname))
//			return false;
//		if (loggedIn != other.loggedIn)
//			return false;
//		if (password == null) {
//			if (other.password != null)
//				return false;
//		} else if (!password.equals(other.password))
//			return false;
//		return true;
//	}
//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
//				+ ", password=" + password + ", loggedIn=" + loggedIn + "]";
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getFirstname() {
//		return firstname;
//	}
//
//	public void setFirstname(String firstname) {
//		this.firstname = firstname;
//	}
//
//	public String getLastname() {
//		return lastname;
//	}
//
//	public void setLastname(String lastname) {
//		this.lastname = lastname;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public boolean isLoggedIn() {
//		return loggedIn;
//	}
//
//	public void setLoggedIn(boolean loggedIn) {
//		this.loggedIn = loggedIn;
//	}
//}

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
	private @Id @GeneratedValue long id;
	private @NotBlank String username;
	private @NotBlank String password;
	private @NotBlank boolean loggedIn;

	public User() {
	}

	public User(@NotBlank String username, @NotBlank String password) {
		this.username = username;
		this.password = password;
		this.loggedIn = false;
	}

	public long getId() {
		return id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isLoggedIn() {
		return loggedIn;
	}

	public void setLoggedIn(boolean loggedIn) {
		this.loggedIn = loggedIn;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (!(o instanceof User))
			return false;
		User user = (User) o;
		return Objects.equals(username, user.username) && Objects.equals(password, user.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, username, password, loggedIn);
	}

	@Override
	public String toString() {
		return "User{" + "id=" + id + ", username='" + username + '\'' + ", password='" + password + '\''
				+ ", loggedIn=" + loggedIn + '}';
	}
}