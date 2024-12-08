package interfaces;

import java.util.List;

public interface UserInterface {
public User addOne(User user);
public List<User> getUsers();
public void deleteOne(long index);
public User getOne(long index);
public User updateUser(User user,long index );
public boolean authentifier(String email,String password);
public default boolean majeur(int age) {
	return age>18;
}
}
