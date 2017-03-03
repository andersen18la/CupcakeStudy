package Model;


public class Bottom {
    private int botID;
    private String botName;
    private int botPrice;

    public Bottom(int botID, String botName, int botPrice) {
        this.botID = botID;
        this.botName = botName;
        this.botPrice = botPrice;
    }

    public int getBotId() {
        return botID;
    }

    public void setBotId(int botId) {
        this.botID = botID;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public int getBotPrice() {
        return botPrice;
    }

    public void setBotPrice(int botPrice) {
        this.botPrice = botPrice;
    }
    
}
