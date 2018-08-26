package th.ac.kmutt.sit.MyFirstServices.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    User[] user = new User[5];
    String[] allname = {"Pasut", "Thanatcha", "Pattharathon", "Tanapat", "Wutthipong"};

    @GetMapping("/user/1")
    public User getUser() {
        User.addUser(user, allname);
        return user[0];

    }

    @GetMapping("/user/all")
    public User[] getUserAll() {
        User.addUser(user, allname);
        return user;
    }

}
