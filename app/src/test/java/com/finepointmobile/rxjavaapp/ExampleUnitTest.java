package com.finepointmobile.rxjavaapp;

import com.finepointmobile.rxjavaapp.model.User;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void user_has_name() throws Exception {
        User user = new User();
        user.setName("Daniel Malone");
        user.setEmail("daniel@finepointmobile.com");

        assertEquals("Daniel Malone", user.getName());
    }
}