package by.itacademy.courses.hw8;

public class User {
    private String login;
    private String password;

    public User (String login, String password) {
        this.login = login;
        this.password = password;
    }

    public class Query {
        void printToLog() {
            System.out.println("A user with the following username and password sent a request: " + "\nLogin: " + login
                    + "\nPassword: " + password);
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

