package dio.project.padroes.spring;

import dio.project.padroes.spring.model.User;
import dio.project.padroes.spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    public MyCommandLineRunner(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {

            User user1 = new User("john.doe@example.com", 18);
            User user2 = new User("jane.doe@example.com", 18);
            userRepository.save(user1);
            userRepository.save(user2);
        }



}

