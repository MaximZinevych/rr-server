package resecurity.controller;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AuthBody {

    private String email;
    private String password;
}
