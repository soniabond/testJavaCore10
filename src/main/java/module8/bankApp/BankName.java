package module8.bankApp;

public enum BankName {
    PRIVATBANK(11111, "tov PrivatBank"),
    MONOBANK(111123, "universal bank"),
    UKRSIBBBANK(9999, "tov ukrsibbank");

    int id;
    String fullBankName;

    BankName(int id, String fullBankName) {
        this.id = id;
        this.fullBankName = fullBankName;
    }

    public int getId() {
        return id;
    }

    public String getFullBankName() {
        return fullBankName;
    }
}
