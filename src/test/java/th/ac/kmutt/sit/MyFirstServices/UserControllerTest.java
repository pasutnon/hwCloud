/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.kmutt.sit.MyFirstServices;

import java.util.Arrays;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.ac.kmutt.sit.MyFirstServices.Controller.User;
import th.ac.kmutt.sit.MyFirstServices.Controller.UserController;

/**
 *
 * @author homun
 */
public class UserControllerTest {

    UserController userController;
    Object[] expected = new Object[5];
    String[] allname = {"Pasut", "Thanatcha", "Pattharathon", "Tanapat", "Wutthipong"};

    @Before
    public void setUp() {
        userController = new UserController();
        int i;

        for (i = 0; i <= 4; i++) {
            expected[i] = new User(i + 1, allname[i]);

        }

    }

    @Test
    public void getUserAll() {
        int i;
        for (i = 0; i <= 4; i++) {
            Assert.assertNotSame(expected[i], userController.getUserAll());
        }

    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
