package Model;

public class User {
    private String username;
    private String email;
    private String password;
    private int balance;
    private boolean valid;

    public User () {
        
        
    }
    public User(String username, String password, int balance, String email) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }
    
    
}
