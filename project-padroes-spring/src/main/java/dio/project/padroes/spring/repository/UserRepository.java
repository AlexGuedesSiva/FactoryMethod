package dio.project.padroes.spring.repository;

import dio.project.padroes.spring.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void delete(User user);
}
