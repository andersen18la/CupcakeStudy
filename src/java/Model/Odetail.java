package Model;


public class Odetail {
private int ono;
private int userId;
private int qty;
private int price;

    public Odetail(int ono, int userId, int qty, int price) {
        this.ono = ono;
        this.userId = userId;
        this.qty = qty;
        this.price = price;
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

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
