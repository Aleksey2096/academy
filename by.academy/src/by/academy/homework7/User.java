package by.academy.homework7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.time.LocalDate;
import java.util.Objects;

public class User extends Person {
	private String logIn;
	private String password;
	private String email;

	public User() {
		super();
	}

	public User(String logIn, String password, String email) {
		super();
		this.logIn = logIn;
		this.password = password;
		this.email = email;
	}

	public String getLogIn() {
		return logIn;
	}

	public void setLogIn(String logIn) {
		this.logIn = logIn;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void printUserInfo() {
		try {
			Class<?> userClass = Class.forName("by.academy.homework7.User");
			Class<?> personClass = Class.forName("by.academy.homework7.Person");
			System.out.println("                                                   getMethod(\"name\")");
			System.out.println(userClass.getMethod("getFirstName"));
			System.out.println(userClass.getMethod("setFirstName", String.class));
			System.out.println(userClass.getMethod("getLastName"));
			System.out.println(userClass.getMethod("setLastName", String.class));
			System.out.println(userClass.getMethod("getAge"));
			System.out.println(userClass.getMethod("setAge", int.class));
			System.out.println(userClass.getMethod("getDateOfBirth"));
			System.out.println(userClass.getMethod("setDateOfBirth", LocalDate.class));
			System.out.println(userClass.getMethod("getLogIn"));
			System.out.println(userClass.getMethod("setLogIn", String.class));
			System.out.println(userClass.getMethod("getPassword"));
			System.out.println(userClass.getMethod("setPassword", String.class));
			System.out.println(userClass.getMethod("getEmail"));
			System.out.println(userClass.getMethod("setEmail", String.class));
			System.out.println(userClass.getMethod("printUserInfo"));
			System.out.println(userClass.getMethod("hashCode"));
			System.out.println(userClass.getMethod("equals", Object.class));
			System.out.println(userClass.getMethod("toString"));
			System.out.println('\n' + "                                                   getMethods()");
			Method[] methods = userClass.getMethods();
			for (Method x : methods) {
				System.out.println(x);
			}
			System.out.println('\n' + "                                                   getField(\"name\")");
			try {
				System.out.println(personClass.getField("firstName"));
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
			try {
				System.out.println(personClass.getField("lastName"));
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
			try {
				System.out.println(personClass.getField("age"));
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
			try {
				System.out.println(personClass.getField("dateOfBirth"));
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
			try {
				System.out.println(userClass.getField("logIn"));
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
			try {
				System.out.println(userClass.getField("password"));
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
			try {
				System.out.println(userClass.getField("email"));
			} catch (NoSuchFieldException e) {
				e.printStackTrace();
			}
			System.out.println('\n' + "                                                   getFields()");
			Field[] fields = personClass.getFields();
			for (Field x : fields) {
				System.out.println(x);
			}
			Field[] fields1 = userClass.getFields();
			for (Field x : fields1) {
				System.out.println(x);
			}
			System.out.println('\n' + "                                                   getDeclaredMethod(\"name\")");
			System.out.println(personClass.getDeclaredMethod("getFirstName"));
			System.out.println(personClass.getDeclaredMethod("setFirstName", String.class));
			System.out.println(personClass.getDeclaredMethod("getLastName"));
			System.out.println(personClass.getDeclaredMethod("setLastName", String.class));
			System.out.println(personClass.getDeclaredMethod("getAge"));
			System.out.println(personClass.getDeclaredMethod("setAge", int.class));
			System.out.println(personClass.getDeclaredMethod("getDateOfBirth"));
			System.out.println(personClass.getDeclaredMethod("setDateOfBirth", LocalDate.class));
			System.out.println(userClass.getDeclaredMethod("getLogIn"));
			System.out.println(userClass.getDeclaredMethod("setLogIn", String.class));
			System.out.println(userClass.getDeclaredMethod("getPassword"));
			System.out.println(userClass.getDeclaredMethod("setPassword", String.class));
			System.out.println(userClass.getDeclaredMethod("getEmail"));
			System.out.println(userClass.getDeclaredMethod("setEmail", String.class));
			System.out.println(userClass.getDeclaredMethod("printUserInfo"));
			System.out.println(userClass.getDeclaredMethod("hashCode"));
			System.out.println(userClass.getDeclaredMethod("equals", Object.class));
			System.out.println(userClass.getDeclaredMethod("toString"));
			System.out.println('\n' + "                                                   getDeclaredMethods()");
			Method[] declaredMethods = personClass.getDeclaredMethods();
			for (Method x : declaredMethods) {
				System.out.println(x);
			}
			Method[] declaredMethods1 = userClass.getDeclaredMethods();
			for (Method x : declaredMethods1) {
				System.out.println(x);
			}
			System.out.println('\n' + "                                                   getDeclaredField(\"name\")");
			System.out.println(personClass.getDeclaredField("firstName"));
			System.out.println(personClass.getDeclaredField("lastName"));
			System.out.println(personClass.getDeclaredField("age"));
			System.out.println(personClass.getDeclaredField("dateOfBirth"));
			System.out.println(userClass.getDeclaredField("logIn"));
			System.out.println(userClass.getDeclaredField("password"));
			System.out.println(userClass.getDeclaredField("email"));
			System.out.println('\n' + "                                                   getDeclaredFields()");
			Field[] declaredFields = personClass.getDeclaredFields();
			for (Field x : declaredFields) {
				System.out.println(x);
			}
			Field[] declaredFields1 = userClass.getDeclaredFields();
			for (Field x : declaredFields1) {
				System.out.println(x);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(email, logIn, password);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(email, other.email) && Objects.equals(logIn, other.logIn)
				&& Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		return "User [logIn=" + logIn + ", password=" + password + ", email=" + email + "]";
	}
}
