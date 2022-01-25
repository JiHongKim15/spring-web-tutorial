package mbti.mbtiwisdom.service;

import lombok.AllArgsConstructor;
import mbti.mbtiwisdom.domain.User;
import mbti.mbtiwisdom.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@AllArgsConstructor
public class UserService {

    private UserRepository repository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public User register(User user){
        return repository.save(user);
    }

    @Transactional(readOnly = true)
    public Optional<User> findUserById(String id){
        return repository.findById(id);
    }

    @Transactional
    public void deleteUser(String id){
        repository.deleteById(id);
    }
}
