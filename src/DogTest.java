import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void getName() {
        Dog dog = new Dog("Alberts", 2);
        assertEquals("Alberts", dog.getName());
    }

    @Test
    void setName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void setAge() {
    }
}