package seminar6homework;

import seminar6homework.persister.Persisterable;
import seminar6homework.persister.impl.Persister;
import seminar6homework.report.impl.UserReport;

public class Main {
    public static void main(String[] args) {
        User user = new User("Bob");
        Persisterable persister = new Persister();
        UserReport userReport = new UserReport();
        persister.save(user);
        userReport.report(user);
    }
}