package dio.project.padroes.spring.service;

import dio.project.padroes.spring.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User create(String name, int age);
    User update(Long id, String name, int age);
    void delete(Long id);
}
