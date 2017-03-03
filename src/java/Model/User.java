package Model;

public class User {

    private String userId;
    private String email;
    private String password;
    private int balance;
    private boolean valid;

    public User() {

    }

    public User(String userId, String email, String password, int balance) {
        this.userId = userId;
        this.email = email;
        this.password = password;
        this.balance = balance;
        
    }

    
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
