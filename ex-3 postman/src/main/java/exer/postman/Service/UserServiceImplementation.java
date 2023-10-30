package exer.postman.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exer.postman.Model.User;
import exer.postman.Repo.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    UserRepository userRepository;
  
    @Override
    public List<User> getAllUsers() {
      return (List<User>) userRepository.findAll();
    }
  
    @Override
    public Optional<User> getUserById(long id) {
      return userRepository.findById(id);
    }
  
    @Override
    public String addUser(User user) {
      userRepository.save(user);
      return "User saved successfully";
    }
  
    @Override
    public String updateUser(long id, User user) {
      user.setId(id);
      userRepository.save(user);
      return "User updated successfully";
    }
  
    @Override
    public String deleteUser(long id) {
      userRepository.deleteById(id);
      return "User Deleted Successfully";
    }

}