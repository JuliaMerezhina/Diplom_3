package user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.RandomStringUtils;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    public static final String EMAIL = "@yandex.ru";
    private String name;
    private String email;
    private String password;

    public static User getCorrect() {
        return new User("Julia", "juli89@yandex.ru", "PrUksa");
    }

    public static User getIncorrect() {
        return new User("Julia", "juli89@yandex.ru", "PrUksavill");
    }

    public static User getRandomUser() {
        User user = new User();
        user.setName(RandomStringUtils.randomAlphabetic(10));
        user.setEmail(RandomStringUtils.randomAlphabetic(10) + EMAIL);
        user.setPassword(RandomStringUtils.randomAlphabetic(10));
        return user;
    }
}