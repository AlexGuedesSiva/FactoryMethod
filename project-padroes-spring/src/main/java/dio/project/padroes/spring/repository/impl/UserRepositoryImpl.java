package dio.project.padroes.spring.repository.impl;

import dio.project.padroes.spring.model.User;
import dio.project.padroes.spring.repository.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository

public class UserRepositoryImpl implements UserRepository {

    private List<User> users = new ArrayList<>();

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public User findById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void save(User user) {
        if (user.getId() == null) {
            user.setId(users.size() + 1L);
            users.add(user);
        } else {
            User existingUser = findById(user.getId());
            if (existingUser != null) {
                existingUser.setName(user.getName());
                existingUser.setAge(user.getAge());
            }
        }
    }

    @Override
    public void delete(User user) {
        users.remove(user);
    }
}
