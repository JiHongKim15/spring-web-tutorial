package mbti.mbtiwisdom.service;

import mbti.mbtiwisdom.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Transactional
    @Test
    void register() {
        User user = User.builder()
                .id("wisdom1234")
                .name("김지혜")
                .password("1234")
                .build();

        User savedUser = userService.register(user);
        Assertions.assertEquals(user.getId(), savedUser.getId());
    }

    @Test
    void findUserByIdIfExist() {
        Optional<User> findUser = userService.findUserById("wisdom123");
        Assertions.assertNotNull(findUser.orElse(null));
    }

    @Test
    void findUserByIdIfNotExist() {

        Optional<User> findUser = userService.findUserById("wisdom13");
        Assertions.assertNull(findUser.orElse(null));
    }
}