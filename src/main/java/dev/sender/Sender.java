package dev.sender;

import java.util.Properties;

public class Sender {
    private String username;
    private String password;
    private Properties props;

    public Sender(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
