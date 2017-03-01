package Model;

public class Order {
int ono;
int userId;

    public Order(int ono, int userId) {
        this.ono = ono;
        this.userId = userId;
    }

    public int getOno() {
        return ono;
    }

    public void setOno(int ono) {
        this.ono = ono;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

}
