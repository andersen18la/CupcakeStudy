package Model;

public class User {
    String username;
    String email;
    String password;
    int balance;

    public User () {
        
        
    }
    public User(String username, String password, int balance, String email) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.email = email;
    }
    
    
}
