package user;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserAuthorization {

    private String email;
    private String password;

    public UserAuthorization getUserAuthorization(User user) {
        return new UserAuthorization(user.getEmail(), user.getPassword());
    }
}
