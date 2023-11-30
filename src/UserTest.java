import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {


    @Test
    void getAllUsers() {
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);
        List<User> expected = User.getAllUsers();
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getAllAgeUsers() {

    }

}