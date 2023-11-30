import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    //метод будет сравнивать все поля объектов и даже поля родителей если есть наследование
    @Test
    void getAllUsers() {
        //создаем тестовые данные
        User user = new User("Евгений", 35, Sex.MALE);
        User user1 = new User("Марина", 34, Sex.FEMALE);
        User user2 = new User("Алина", 7, Sex.FEMALE);
        //проверка метода getAllUser()
        //создаем список expected и заполняем его данными нашего метода
        List<User> expected = User.getAllUsers();
        //создаем список actual и в него добавляем данные для сравнения
        List<User> actual = new ArrayList<>();
        actual.add(user);
        actual.add(user1);
        actual.add(user2);
        //запускаем тест
        Assert.assertEquals(expected, actual);
    }

    @Test
    void getAllAgeUsers() {

    }

}