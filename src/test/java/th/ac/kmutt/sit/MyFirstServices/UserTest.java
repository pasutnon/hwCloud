/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.ac.kmutt.sit.MyFirstServices;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import th.ac.kmutt.sit.MyFirstServices.Controller.User;

/**
 *
 * @author homun
 */
public class UserTest {

    User user;

    @Before
    public void setUp() {
        user = new User(1, "Pasut");
    }

    @Test
    public void getId() {
        int expected = 1;
        Assert.assertEquals(expected, this.user.getId());
    }

    @Test
    public void setId() {
        this.user.setId(2);
        int expected = 2;
        Assert.assertEquals(expected, this.user.getId());
    }

    @Test
    public void getName() {
        String expected = "Pasut";
        Assert.assertEquals(expected, this.user.getName());
    }

    @Test
    public void setName() {
        this.user.setName("Thanatcha");
        String expected = "Thanatcha";
        Assert.assertEquals(expected, this.user.getName());
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
