package seminar6homework.persister.impl;

import seminar6homework.User;
import seminar6homework.persister.Persisterable;

public class Persister implements Persisterable {

    @Override
    public void save(User user) {
        System.out.println("Save user: " + user.getName());
    }
}
