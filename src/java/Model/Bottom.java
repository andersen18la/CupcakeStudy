package Model;


public class Bottom {
    int botId;
    String botName;
    int botPrice;

    public Bottom(int botId, String botName, int botPrice) {
        this.botId = botId;
        this.botName = botName;
        this.botPrice = botPrice;
    }

    public int getBotId() {
        return botId;
    }

    public void setBotId(int botId) {
        this.botId = botId;
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
