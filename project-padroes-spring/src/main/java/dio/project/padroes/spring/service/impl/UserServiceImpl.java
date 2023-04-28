package dio.project.padroes.spring.service.impl;

import dio.project.padroes.spring.model.User;
import dio.project.padroes.spring.repository.UserRepository;
import dio.project.padroes.spring.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User create(String name, int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userRepository.save(user);
        return user;
    }

    @Override
    public User update(Long id, String name, int age) {
        User user = userRepository.findById(id);
        if (user != null) {
            user.setName(name);
            user.setAge(age);
            userRepository.save(user);
        }
        return user;
    }

    @Override
    public void delete(Long id) {
        User user = userRepository.findById(id);
        if (user != null) {
            userRepository.delete(user);
        }
    }
}
