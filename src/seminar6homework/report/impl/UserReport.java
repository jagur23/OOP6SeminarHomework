package seminar6homework.report.impl;

import seminar6homework.User;
import seminar6homework.report.Reportable;

public class UserReport implements Reportable {

    @Override
    public void report(User user) {
        System.out.println("Report for user: " + user.getName());
    }
}
