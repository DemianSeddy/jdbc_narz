package Nomen;

public class ListNomen {

    private String name;             //номенклатурная позиция наименование
    private String vendor;           //Артикул, обозначение
    private String document;         //ГОСТ
    private String stock;            //Склад
    private String measurements;     //Единица измерения
    private String seller;           //Продавец
    private String  howMuchToBuy;     //Сколько купить
    private String  stockBalance;     //Остаток на складе

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String standartdocument) {
        this.document = standartdocument;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getMeasurements() {
        return measurements;
    }

    public void setMeasurements(String measurements) {
        this.measurements = measurements;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getHowMuchToBuy() {
        return howMuchToBuy;
    }

    public void setHowMuchToBuy(String howMuchToBuy) {
        this.howMuchToBuy = howMuchToBuy;
    }

    public String getStockBalance() {
        return stockBalance;
    }

    public void setStockBalance(String stockBalance) {
        this.stockBalance = stockBalance;
    }

    public ListNomen(String name, String vendor, String document, String stock, String measurements, String seller, String howMuchToBuy, String stockBalance) {

        this.name = name;
        this.vendor = vendor;
        this.document = document;
        this.stock = stock;
        this.measurements = measurements;
        this.seller = seller;
        this.howMuchToBuy = howMuchToBuy;
        this.stockBalance = stockBalance;

    }


}
