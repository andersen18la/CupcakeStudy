package Model;


public class Topping {
    private int topId;
    private String topName;
    private int topPrice;

    public Topping(int topId, String topName, int topPrice) {
        this.topId = topId;
        this.topName = topName;
        this.topPrice = topPrice;
    }

    public int getTopId() {
        return topId;
    }

    public void setTopId(int topId) {
        this.topId = topId;
    }

    public String getTopName() {
        return topName;
    }

    public void setTopName(String topName) {
        this.topName = topName;
    }

    public int getTopPrice() {
        return topPrice;
    }

    public void setTopPrice(int topPrice) {
        this.topPrice = topPrice;
    }
    
}
